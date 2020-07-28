package edu.hust.top.controller;

import com.github.pagehelper.PageInfo;
import edu.hust.top.bean.Building;
import edu.hust.top.bean.Region;
import edu.hust.top.service.BuildingService;
import edu.hust.top.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author dwx
 * @create 2020-07-28 11:06
 */
@Controller
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @Autowired
    private RegionService regionService;

    /**
     * 该方法用于查询所有园区信息，并跳转新增建筑页面
     * @param session
     * @return
     */
    @RequestMapping("/building/to/add/page.html")
    public String buildingToAddPage(HttpSession session){
        // 由于新增建筑页面需要园区的下拉框
        // 先判断session域中是否已经存在
        List<Region> list = (List<Region>) session.getAttribute("regionList");

        // 不存在就将园区信息查出来
        if(list == null || list.size() == 0){
            List<Region> regionList = regionService.getRegionList();

            // 由于后面一直要用园区信息，所以将得到的园区列表放入session域中
            session.setAttribute("regionList", regionList);
        }

        // 转发到添加页面
        return "building-add";
    }

    /**
     * 该方法用于新增建筑信息
     * @param building
     * @param session
     * @return
     */
    @RequestMapping("/building/add.html")
    public String buildingAdd(Building building, HttpSession session){

        try {
            // 调用service层方法将building信息存入数据库
            buildingService.addBuilding(building);

            // 如果没有异常，重定向至建筑物列表页面
            return "redirect:/building/list/page.html";
        } catch (Exception e) {
            e.printStackTrace();

            // 如果有异常，将异常信息存入session域回显页面
            // 此处使用session是因为重定向
            session.setAttribute("message", e.getMessage());

            // 由于转发无法携带园区数据，所以重定向至分页页面
            return "redirect:/building/to/add/page.html";
        }

    }

    /**
     * 该方法用于查询building的所有信息，并将信息返回
     * @param regionId
     * @param keyword
     * @param pageNum
     * @param pageSize
     * @param map
     * @param session
     * @return
     */
    @RequestMapping("/building/list/page.html")
    public String listBuilding(@RequestParam(value = "regionId", defaultValue = "0")Integer regionId,
                               @RequestParam(value = "keyword", defaultValue = "")String keyword,
                               @RequestParam(value = "pageNum", defaultValue = "1")Integer pageNum,
                               @RequestParam(value = "pageSize", defaultValue = "20")Integer pageSize,
                               ModelMap map,
                               HttpSession session){

        // 由于查看建筑页面需要园区的下拉框
        // 先判断session域中是否已经存在
        List<Region> list = (List<Region>) session.getAttribute("regionList");

        // 不存在就将园区信息查出来
        if(list == null || list.size() == 0){
            List<Region> regionList = regionService.getRegionList();

            // 由于后面一直要用园区信息，所以将得到的园区列表放入session域中
            session.setAttribute("regionList", regionList);
        }

        // 调用service层的getRegionList方法查询和分页
        PageInfo<Building> pageInfo = buildingService.getBuildingList(regionId, keyword, pageNum, pageSize);

        // 将得到的pageInfo放入request域中
        map.addAttribute("pageInfo", pageInfo);
        map.addAttribute("regionId", regionId);
        map.addAttribute("keyword", keyword);
        map.addAttribute("pageNum", pageNum);

        // 实现页面跳转
        return "building-list";
    }

    /**
     * 该方法用于去往修改建筑物页面，回显表单数据
     * @param buildingid
     * @param regionId
     * @param pageNum
     * @param keyword
     * @param map
     * @return
     */
    @RequestMapping("/building/to/update/page.html")
    public String buildingToUpdatePage(@RequestParam("buildingid")Integer buildingid,
                                       @RequestParam(value = "regionId", defaultValue = "0")Integer regionId,
                                       @RequestParam(value = "pageNum", defaultValue = "1")Integer pageNum,
                                       @RequestParam(value = "keyword", defaultValue = "")String keyword,
                                       ModelMap map){

        try {
            // 调用service层的方法去查询building对象
            Building building = buildingService.selectBuildingById(buildingid);

            // 将查询到的building对象放在域中，便于后续页面回显
            map.addAttribute("building", building);
            map.addAttribute("regionId", regionId);
            map.addAttribute("keyword", keyword);
            map.addAttribute("pageNum", pageNum);

            // 实现页面跳转
            return "building-update";

        } catch (Exception e) {
            e.printStackTrace();

            // 如果出现异常，重定向到列表页面
            return "redirect:/building/list/page.html?regionId="+regionId+"pageNum="+pageNum+"&keyword="+keyword;
        }
    }

    /**
     *该方法用于提交修改之后的表单数据，更新数据库
     * @param building
     * @param regionId
     * @param pageNum
     * @param keyword
     * @param map
     * @return
     */
    @RequestMapping("/building/update.html")
    public String updateBuilding(Building building,
                                 @RequestParam(value = "regionId", defaultValue = "0")Integer regionId,
                                 @RequestParam(value = "pageNum", defaultValue = "1")Integer pageNum,
                                 @RequestParam(value = "keyword", defaultValue = "")String keyword,
                                 ModelMap map){
        try {
            // 调用service层的更新方法
            buildingService.updateBuilding(building);

            // 如果未出现异常，重定向到显示列表页面
            return "redirect:/building/list/page.html?regionId="+regionId+"&pageNum="+pageNum+"&keyword="+keyword;

        } catch (Exception e) {
            e.printStackTrace();

            // 将异常信息放入模型，回显到页面
            map.addAttribute("message", e.getMessage());

            // 返回当前页面
            return "region-update";
        }
    }

    /**
     * 该方法用于从数据库中删除Building对象
     * @param buildingid
     * @param regionId
     * @param pageNum
     * @param keyword
     * @param map
     * @return
     */
    @RequestMapping("/building/delete.html")
    public String deleteBuilding(@RequestParam("buildingid")Integer buildingid,
                                 @RequestParam(value = "regionId", defaultValue = "0")Integer regionId,
                                 @RequestParam(value = "pageNum", defaultValue = "1")Integer pageNum,
                                 @RequestParam(value = "keyword", defaultValue = "")String keyword,
                                 ModelMap map){
        try {
            // 调用service层的删除方法
            buildingService.deleteBuilding(buildingid);

        } catch (Exception e) {
            e.printStackTrace();

            // 将异常信息放入模型，回显到页面
            map.addAttribute("message", e.getMessage());
        }

        // 无论是否删除成功，重定向到显示列表页面
        return "redirect:/building/list/page.html?regionId="+regionId+"&pageNum="+pageNum+"&keyword="+keyword;
    }
}

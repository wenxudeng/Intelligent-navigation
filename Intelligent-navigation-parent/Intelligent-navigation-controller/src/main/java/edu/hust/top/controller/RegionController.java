package edu.hust.top.controller;

import com.github.pagehelper.PageInfo;
import edu.hust.top.bean.Region;
import edu.hust.top.service.RegionService;
import edu.hust.top.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

/**
 * @author dwx
 * @create 2020-07-19 15:35
 */

@Controller
public class RegionController {

    @Autowired
    private RegionService regionService;

    /**
     * 本方法用于接收浏览器来的文件并上传
     * @param regionMap
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/region/file/upload.json")
    public ResultEntity<String> uploadRegionFile(@RequestParam("regionMap")MultipartFile regionMap, HttpSession session){

        // 判断接收到的文件是否为空
        if(regionMap == null){
            return ResultEntity.failed("上传文件不能为空！");
        }

        // 原始文件名
        String originalFilename = regionMap.getOriginalFilename();// 1544277560888_硚口_outdoor.svg
        
        // 获取文件名后缀
        String fileSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));

        // 判断文件后缀是否为.svg或.js
        if(!".svg".equals(fileSuffix) && !".js".equals(fileSuffix)){
            return ResultEntity.failed("请上传正确文件！");
        }

        try {
            // 将文件上传到项目下region_maps文件夹中
            String filePath = "region_maps/"+originalFilename;

            // 项目真实路径
            String realPath = session.getServletContext().getRealPath("/");

            // 文件应该上传的真实地址
            String finalPath = realPath + filePath;

            // 执行文件上传
//            regionMap.transferTo(new File(finalPath));

            return ResultEntity.successWithData(filePath);

        } catch (Exception e) {
            e.printStackTrace();

            return ResultEntity.failed("文件上传失败！");
        }
    }


    /**
     * 本方法用于保存region信息到数据库
     * @param region
     * @param modelMap
     * @return
     */
    @RequestMapping("/region/add.html")
    public String addRegion(Region region, ModelMap modelMap){

        try {

            // 调用service层的方法将region对象存入数据库
            regionService.addRegion(region);

            // 数据存入成功时，重定向到主页面
            return "redirect:/manager/to/main/page.html";

        } catch (Exception e) {

            e.printStackTrace();

            // 将异常信息放入request域中，回显到页面
            modelMap.addAttribute("message", "保存失败！");

            // 转发到页面
            return "region-add";
        }
    }

    /**
     * 本方法用于查询region的列表信息
     * @param keyword
     * @param pageNum
     * @param pageSize
     * @param map
     * @return
     */
    @RequestMapping("/region/list/page.html")
    public String listRegion(@RequestParam(value = "keyword", defaultValue = "")String keyword,
                             @RequestParam(value = "pageNum", defaultValue = "1")Integer pageNum,
                             @RequestParam(value = "pageSize", defaultValue = "10")Integer pageSize,
                             ModelMap map){

        // 调用service层的getRegionList方法查询和分页
        PageInfo<Region> pageInfo = regionService.getRegionList(keyword, pageNum, pageSize);

        // 将得到的pageInfo放入request域中
        map.addAttribute("pageInfo", pageInfo);
        map.addAttribute("keyword", keyword);
        map.addAttribute("pageNum", pageNum);

        // 实现页面跳转
        return "region-list";
    }

    @RequestMapping("/region/to/update/page.html")
    public String regionToUpdatePage(@RequestParam("regionid")Integer regionid,
                                     @RequestParam(value = "pageNum", defaultValue = "1")Integer pageNum,
                                     @RequestParam(value = "keyword", defaultValue = "")String keyword,
                                     ModelMap map){

        try {
            // 调用service层的方法去查询region对象
            Region region = regionService.selectRegionById(regionid);

            // 将查询到的region对象放在域中，便于后续页面回显
            map.addAttribute("region", region);

            // 实现页面跳转
            return "region-update";

        } catch (Exception e) {
            e.printStackTrace();

            // 如果出现异常，重定向到列表页面
            return "redirect:/region/list/page.html?pageNum="+pageNum+"&keyword="+keyword;
        }
    }

}

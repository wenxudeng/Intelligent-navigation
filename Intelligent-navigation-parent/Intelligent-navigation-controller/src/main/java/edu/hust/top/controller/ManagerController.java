package edu.hust.top.controller;

import edu.hust.top.bean.Manager;
import edu.hust.top.service.ManagerService;
import edu.hust.top.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author dwx
 * @create 2020-07-18 8:42
 */

@Controller
public class ManagerController {

    @Autowired
    private ManagerService managerService;


    /**
     * 该方法作用是管理员登录验证
     * @param manager
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/manager/do/login.json")
    public ResultEntity<String> managerDoLogin(Manager manager, HttpSession session){

        try {
            // 调用service层登录方法
            Integer namagerid = managerService.doLogin(manager);

            // 将管理员id设置到对象中
            manager.setNamagerid(namagerid);

            // 没有抛出异常说明管理员信息有效，将管理员姓名存入session域中
            session.setAttribute("manager", manager);

            // 成功返回且不带数据
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            e.printStackTrace();

            // 如果登录中出现异常，携带异常信息返回
            return ResultEntity.failed(e.getMessage());
        }
    }


    /**
     * 该方法的作用是管理员退出登录
     * @param session
     * @return
     */
    @RequestMapping("/manager/do/logout.html")
    public String managerDoLogout(HttpSession session){
        // 将session域清空
        session.invalidate();

        // 重定向到起始页面
        return "redirect:/index.html";
    }

    /**
     * 本方法用于管理员修改密码
     * @param namagerid
     * @param oldPwd
     * @param newPwd
     * @param newPwd2
     * @param modelMap
     * @return
     */
    @RequestMapping("/manager/change/password.html")
    public String managerChangePassword(@RequestParam("namagerid")Integer namagerid,
                                        @RequestParam("oldPwd")String oldPwd,
                                        @RequestParam("newPwd")String newPwd,
                                        @RequestParam("newPwd2")String newPwd2,
                                        ModelMap modelMap){

        try {
            // 调用service层的changeManagerPassword方法
            managerService.changeManagerPassword(namagerid, oldPwd, newPwd, newPwd2);

            // 如果未出现异常表示修改成功，重定向到首页重新登录
            return "redirect:/manager/do/logout.html";

        } catch (Exception e) {
            e.printStackTrace();

            // 如果出现异常，将异常信息放入request域中返回
            modelMap.addAttribute("message", e.getMessage());

            // 转发到当前页面回显错误信息
            return "manager-change-password";
        }
    }

}

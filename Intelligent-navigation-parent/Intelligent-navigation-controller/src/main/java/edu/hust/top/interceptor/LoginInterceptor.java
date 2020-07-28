package edu.hust.top.interceptor;

import edu.hust.top.bean.Manager;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author dwx
 * @create 2020-07-18 11:10
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    /**
     * 该方法的作用是做登录检查拦截的；未登录不放行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 从request中取出session对象
        HttpSession session = request.getSession();

        // 从session域中取出manager对象
        Manager manager = (Manager) session.getAttribute("manager");

        // 判断manager对象是否为空
        if(manager == null){
            // 如果manager对象为空，重定向到首页
            response.sendRedirect("/index.html");

            // 返回false表示不放行
            return false;
        }

        // 放行
        return true;
    }
}

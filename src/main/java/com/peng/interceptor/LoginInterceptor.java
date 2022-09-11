package com.peng.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 名称:LoginInterceptor
 * 描述:
 *
 * @author:Secret Base
 * @datetime:2022-09-11 17:59:47
 * @version:1.0
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //是否登录过的判断
        if(request.getSession().getAttribute("users") == null){
            //此时没有登录，打回到登录界面，并给出提示
            request.setAttribute("msg","您还没有登录，请先登录！");
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            return false;
        }
        return true;
    }
}

package com.peng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称:WebInfAction
 * 描述:
 *
 * @author:Secret Base
 * @datetime:2022-09-11 16:07:04
 * @version:1.0
 */
@Controller
public class WebInfAction {

    @RequestMapping("/showIndex")
    public String showIndex(){
        System.out.println("访问index.jsp");
        return "index";
    }
    @RequestMapping("/showMain")
    public String showMain(){
        System.out.println("访问main.jsp");
        return "main";
    }
    @RequestMapping("/showLogin")
    public String showLogin(){
        System.out.println("访问login.jsp");
        return "login";
    }
    //登录的业务判断
    @RequestMapping("/login")
    public String login(String name, String pwd, HttpServletRequest request){
        if ("zar".equalsIgnoreCase(name) && "123".equalsIgnoreCase(pwd)) {
            request.getSession().setAttribute("users",name);
            return "main";
        }else{
            request.setAttribute("msg","用户名或密码不正确！");
            return "login";
        }
    }
}

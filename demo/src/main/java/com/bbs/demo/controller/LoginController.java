package com.bbs.demo.controller;

import com.bbs.demo.bean.user;
import com.bbs.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @GetMapping(value = "login")
    public void toLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        user myuser = new user(username,password);
        if (userService.checkUser(myuser)!=null){
            request.getSession().setAttribute("loginuser", username);
            response.sendRedirect("main");

        }else{
            request.setAttribute("error","登录失败 ！");
            request.getRequestDispatcher("index").forward(request, response);
        }
    }

}

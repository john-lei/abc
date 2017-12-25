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
import java.util.List;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @GetMapping(value = "findUser")
    public void toFindUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = (String) request.getSession().getAttribute(
                "loginuser");
        List<user> list = userService.loguser(username);
        request.setAttribute("users", list);
        request.getRequestDispatcher("newMsg").forward(request, response);
    }

    @GetMapping(value = "logout")
    public String toLogout(){
        return "index";
    }
}

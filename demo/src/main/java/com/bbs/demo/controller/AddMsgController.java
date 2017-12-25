package com.bbs.demo.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class AddMsgController {

    @GetMapping(value = "addMsg")
    public String addMsg(HttpServletRequest request, HttpServletResponse response){


        return null;
    }
}

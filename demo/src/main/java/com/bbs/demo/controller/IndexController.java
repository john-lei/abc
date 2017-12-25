package com.bbs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping(value = "index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "register")
    public String register() {
        return "register";
    }

    @RequestMapping(value = "main")
    public String main(){
        return "main";
    }

    @RequestMapping(value = "newMsg")
    public String newMsg(){
        return "newMsg";
    }

    @RequestMapping(value = "readMsg")
    public String readMsg(){
        return "readMsg";
    }
}

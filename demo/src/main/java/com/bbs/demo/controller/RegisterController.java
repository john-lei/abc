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
import java.io.UnsupportedEncodingException;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;

    @GetMapping(value = "zhuce")
    public void toRegister(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String userName = request.getParameter("username");
        String passWold = request.getParameter("password");
        String email = request.getParameter("email");

        user name = new user(userName);
        user myUsers = new user(userName,passWold,email);
        if (userService.checkUsername(name)!=null){
            request.setAttribute("error","注册失败，请重新注册 ！");
            request.getRequestDispatcher("register").forward(request ,response);
        }else{
            userService.addUser(myUsers);
            request.setAttribute("error", "注册成功,请登录 ！");
            request.getRequestDispatcher("index.jsp").forward(request,
                    response);
        }

        /*
        * String username = request.getParameter("username");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			List<UserInfo> list = userservice.getUersrInfo(username);
			if (list.size() > 0) {
				request.setAttribute("error", "注册失败,用户名已经被注册，请重新注册 ！");
				request.getRequestDispatcher("register.jsp").forward(request,
						response);
			} else {
				userinfo = new UserInfo();
				userinfo.setUsername(username);
				userinfo.setPassword(password);
				userinfo.setEmail(email);
				int isRun = userservice.addExecuteUpdate(userinfo);
				if (isRun > 0) {
					request.setAttribute("error", "注册成功,请登录 ！");
					request.getRequestDispatcher("index.jsp").forward(request,
							response);
				}
			}*/
    }
}

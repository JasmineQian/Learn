package com.example.demo.controller;


import com.example.demo.bean.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AnonymousAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


    /*
    @Autowired
    private UserService userService;

    @RequestMapping(value={"/login"})
    public String login(User user) {
        System.out.println(user);
        try {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            if (auth instanceof AnonymousAuthenticationToken) {
                return "index";
            } else {
                //获取用户登录权限详细
                Object pinciba=auth.getPrincipal();
                if(pinciba instanceof UserDetails){
                    UserDetails userDetail = ((UserDetails) pinciba);
                    User u =userService.getByUsername(userDetail.getUsername());
                }
                //登录成功跳到主页
                System.out.println("会员登录成功！");
                return "index";

            }
        } catch (Exception e) {
            e.printStackTrace();
            return "index";
        }

    }
*/
}

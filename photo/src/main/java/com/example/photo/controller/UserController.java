package com.example.photo.controller;

import com.example.photo.entity.User;
import com.example.photo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author swh
 * @Date 2020/5/21 8:52 下午
 **/

@Controller
public class UserController {

    @Autowired
    private UserService userService;

  /*  @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response) {
        *//**
         * 正常来说这里能拿到数据，一般我不写前端 我也不知道怎么跳到这里=了，一般前后端数据传输用json，不这么传数据。
         *//*
        String userName = request.getParameter("user");
        String  pwd = request.getParameter("pwd");

        System.out.println(userName);
        System.out.println(pwd);
        return "12"；
    }*/

    public  void ll(){
        String userName = "swh";
        String password = "123";
        boolean b = userService.login(userName,password);
        System.out.println(b);
        /** return 到其他地址
         * ret
         */
        /*if(b){
            return "";
        }else {
            return "";
        }*/

    }

}

package com.swh.testecs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author swh
 * @Date 2020/5/22 9:45 上午
 **/
@Controller
public class UserCtroller {


    @RequestMapping(value = "/rly",method = RequestMethod.GET)
    public String test() {
        return "/index.html";
    }

    public  String qq(){
        return "hello";
    }
}

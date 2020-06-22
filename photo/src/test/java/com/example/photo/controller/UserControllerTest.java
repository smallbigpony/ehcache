package com.example.photo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author swh
 * @Date 2020/6/22 1:16 下午
 **/
@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserController userController;
    @Test
    public  void a(){
        userController.ll();
    }

}
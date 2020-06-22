package com.swh.testecs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author swh
 * @Date 2020/5/22 10:12 上午
 **/

@SpringBootTest
class UserCtrollerTest {

    @Autowired
    private UserCtroller userCtroller;

    @Test
    public void test(){
        System.out.println(userCtroller.qq());
    }

}
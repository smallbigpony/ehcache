package com.example.photo.service;

import com.example.photo.entity.User;
import com.example.photo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author swh
 * @Date 2020/5/21 8:50 下午
 **/

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public boolean login(String userName,String password){
       // System.out.println(userName);
       // System.out.println(password);
        String  pwd  = userMapper.getPassword(userName);

        return pwd.equals(password);
    }
}

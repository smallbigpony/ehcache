package com.example.photo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author swh
 * @Date 2020/5/21 8:33 下午
 **/

@Getter
@Setter
@ToString
public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

}

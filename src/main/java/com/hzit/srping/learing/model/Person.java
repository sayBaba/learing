package com.hzit.srping.learing.model;

import com.hzit.srping.learing.service.impl.SayChinese;

public class Person {

    private String userName;

    private String password;

    public Person(String userName,String password){
        this.password = password;
        this.userName = userName;

    }

    public String getUserName() {
        return userName;
    }
}

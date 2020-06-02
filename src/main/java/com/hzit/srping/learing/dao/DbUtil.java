package com.hzit.srping.learing.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("dbUtil")
public class DbUtil {

    public void getConn(){
        System.out.println("建立数据库链接..............");

    }
}

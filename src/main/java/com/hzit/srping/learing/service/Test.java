package com.hzit.srping.learing.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {



        //读取spring的配置文件
        ClassPathXmlApplicationContext  xmlApplicationContext = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");

        SayHellep sayHellep =  (SayHellep)xmlApplicationContext.getBean("sayHellep");

        ISayHello iSayHello = sayHellep.getiSayHello();

        iSayHello.sayHello();

    }
}

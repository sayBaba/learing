package com.hzit.srping.learing.service.impl;

import com.hzit.srping.learing.model.Person;
import com.hzit.srping.learing.service.IPersonSevice;
import com.hzit.srping.learing.service.ISayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonSeviceImpl implements IPersonSevice {

    @Autowired
    private ISayHello iSayHello;

    @Override
    public void save(String userName) {

        //先输出 你叫小翠
        System.out.println("---------- start save----------");
//        iSayHello.sayHello();

        System.out.println("------------end save------------");


    }

    @Override
    public void savePerson(Person person) {
        System.out.println("----------savePerson----------");

    }

    @Override
    public String getPersonName(int id) {
        System.out.println("----------getPersonName----------");

        return null;
    }

    @Override
    public String findAll() {
        System.out.println("----------findAll----------");

        return null;
    }
}

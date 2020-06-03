package com.hzit.srping.learing.service;

import com.hzit.srping.learing.model.Person;

public interface IPersonSevice {

    public void save(String userName);

    public void savePerson(Person person);


    public String getPersonName(int id);


    public String findAll();

}

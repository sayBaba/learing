package com.hzit;

import com.hzit.srping.learing.model.Customer;
import com.hzit.srping.learing.service.ISayHello;
import com.hzit.srping.learing.service.LoginService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application*.xml" })
public class Test {

    @Autowired
    private ISayHello iSayHello;

    @Autowired
    LoginService loginService;

    @Autowired
    Customer c;

    @org.junit.Test
    public void testSpring(){
//        iSayHello.sayHello();

//        loginService.test();
            c.getDate();
    }


}

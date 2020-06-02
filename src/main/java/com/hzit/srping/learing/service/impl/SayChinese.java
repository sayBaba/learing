package com.hzit.srping.learing.service.impl;

import com.hzit.srping.learing.service.ISayHello;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SayChinese implements ISayHello {

    @Override
    public void sayHello() {

        System.out.println("SayChinese..........");
    }
}

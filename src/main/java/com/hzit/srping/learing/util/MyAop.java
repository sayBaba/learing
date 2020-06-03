package com.hzit.srping.learing.util;

import com.hzit.srping.learing.model.Person;
import com.hzit.srping.learing.service.IPersonSevice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 切面
 */
//@Aspect
//@Component
public class MyAop {

    /**
     * 定义一个切入点
     */
//    @Pointcut("execution(* com.hzit.srping.learing.controller.*.*(..))")
    public void anyMethod(){

    }


    /**
     * 定义一个通知
     * Before 前置增强，在方法执行之前开始执行
     *
     */
//    @Before("anyMethod()")
//     public void  beforeMethod(){
//        System.out.println("this is Before");
//
//     }

//    /**
//     * 最终增强，无论方法是否异常都会执行
//     */
//    @After("anyMethod()")
    public void  afterMethod(JoinPoint joinPoint){

        //获取链接点参数
        Object[] objects = joinPoint.getArgs();
//
//        joinPoint.getTarget().getClass().
        String a = (String)objects[0];
        System.out.println("a  = " + a);
        System.out.println("this is after");
    }

//
//    /**
//     * 后置增强处理, 出现异常就不会处理
//     */
//    @AfterReturning("anyMethod()")
//    public void  AfterReturningMethod(){
//        System.out.println("this is AfterReturning");
//    }


//    @Around("anyMethod()")
//    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
//        System.out.println("this is aroundMethod");
//
//        //环绕通知，必须要加下下面代码，让程序继续执行
//        try {
//            proceedingJoinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//
//
//    }

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IPersonSevice iPersonSevice = (IPersonSevice) applicationContext.getBean("person");
        Person person = new Person("","");
        iPersonSevice.save("666");

//        iPersonSevice.findAll();


    }


}

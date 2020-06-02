package com.hzit.srping.learing.controller;

import com.hzit.srping.learing.dao.DbUtil;
import com.hzit.srping.learing.model.Customer;
import com.hzit.srping.learing.model.Person;
import com.hzit.srping.learing.model.User;
import com.hzit.srping.learing.service.ISayHello;
import com.hzit.srping.learing.service.LoginService;
import com.hzit.srping.learing.service.SayHellep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;


@WebServlet("/login")
public class LoginController extends HttpServlet {


    //spring springMVC

    @Autowired //注入对象
    private ISayHello iSayHello; //

    @Autowired
    private Customer customer;

    @Resource(name = "dbUtil")
    private DbUtil dbUtil;



    @Override
    public void init(ServletConfig config) throws ServletException {

        super.init(config);
        //servlet 中使用spring 必须要加这个
        ServletContext application = this.getServletContext();
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, application);

    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        iSayHello.sayHello();

        System.out.println("时间---" + customer.getDate());

//        dbUtil.getConn();

    }




    public  void login(){




       // User u = new User();

        //读取spring的配置文件
//        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        User user =  (User)xmlApplicationContext.getBean("user");
//        user.getPhone();
//
//        user.getLoginService();
//
//
//        Person p =  (Person)xmlApplicationContext.getBean("person");
//
//        System.out.println("=======" + p.getUserName());
//
//
//        Customer c =  (Customer)xmlApplicationContext.getBean("customer");
//
//      List<User> userList = c.getUserList();
//      for(User u:userList){
//          System.out.println("-------" + u.getUserName());
//      }

//      System.err.println(c.getDate());



    }
//
//    public static void main(String[] args) {
//
//        new LoginController().login();
//
//    }

}

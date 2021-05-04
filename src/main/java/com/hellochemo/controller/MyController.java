package com.hellochemo.controller;

import com.hellochemo.MainConfig.MainConfig;
import com.hellochemo.bean.MyBean;
import com.hellochemo.service.MyBeanService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(value="/login")
    public Boolean Login(@RequestParam Integer id, @RequestParam String upass) {
        MyBeanService myBeanService=null;
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
            myBeanService = (MyBeanService) applicationContext.getBean("myBeanServiceImpl");

            MyBean name = getEmployeeDetails(myBeanService,id);
            if(name!=null && name.getUpass().equals(upass)) {
                return true;
            }
            return false;
    }

    @GetMapping(value="/logon")
    public String Logon(@RequestParam String uname, @RequestParam String upass) {
        MyBeanService myBeanService=null;
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        myBeanService = (MyBeanService) applicationContext.getBean("myBeanServiceImpl");

        int id = addUser(myBeanService, uname, upass);
        if(id!=404) {
            return "Login Succesfull with id " + id;
        }
        return "logon failed xD";
    }
    public static Integer addUser(MyBeanService serviceImpl, String uname, String upass) {

        MyBean bean = new MyBean();
        bean.setName(uname);
        bean.setUpass(upass);
        int id = 404;
        try {
            id = serviceImpl.addUser(bean);
            System.out.println("Employee Registered Successfully: " + id);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return id;
    }

    public static MyBean getEmployeeDetails(MyBeanService serviceImpl, Integer id) {

        try {

            MyBean employeeBean = serviceImpl.getUserDetails(id);

            if (employeeBean == null)
            {
                return null;
            }
            else
            {
                System.out.println("LDAP was called for User details");
                return employeeBean;
            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        return null;
    }
}

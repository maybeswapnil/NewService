package com.hellochemo.service;

import com.hellochemo.bean.MyBean;

public interface MyBeanService {
    Integer addUser(MyBean myBean) throws Exception;

    MyBean getUserDetails(Integer id) throws Exception;

}

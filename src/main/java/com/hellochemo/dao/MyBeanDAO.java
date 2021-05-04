package com.hellochemo.dao;

import com.hellochemo.bean.MyBean;

public interface MyBeanDAO {
    Integer addUser(MyBean myBean) throws Exception;

    MyBean getUserDetails(Integer id) throws Exception;
}

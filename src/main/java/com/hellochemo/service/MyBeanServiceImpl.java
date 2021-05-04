package com.hellochemo.service;

import com.hellochemo.bean.MyBean;
import com.hellochemo.dao.MyBeanDAO;
import com.hellochemo.exceptions.InvalidUpdateOperationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBeanServiceImpl implements MyBeanService{
    @Autowired
    private MyBeanDAO myBeanDAO;

    public Integer addUser(MyBean myBean) throws Exception {
        return myBeanDAO.addUser((myBean));
    }


    public MyBean getUserDetails(Integer id) throws Exception {
        MyBean bean =myBeanDAO.getUserDetails(id);
        if(bean==null){
            throw new InvalidUpdateOperationException();
        }
        return bean;
    }

}

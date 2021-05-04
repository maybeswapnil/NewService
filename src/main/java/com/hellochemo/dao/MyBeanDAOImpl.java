package com.hellochemo.dao;

import com.hellochemo.bean.MyBean;
import com.hellochemo.entity.MyBeanEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@SuppressWarnings("unchecked")
@Transactional(value="txManager")
public class MyBeanDAOImpl implements MyBeanDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Integer addUser(MyBean myBean) throws Exception{
        // TODO Auto-generated method stub
        Integer userID = 0;

        MyBeanEntity employeeEntityBean =convertBeanToEntity(myBean);
        try {
            entityManager.persist(employeeEntityBean);

            userID = employeeEntityBean.getId();
        } catch (Exception exception) {
            throw exception;
        }
        return userID;
    }

    public MyBean getUserDetails(Integer id) throws Exception{
        // TODO Auto-generated method stub
        MyBean myBean = null;
        try {
            MyBeanEntity myBeanEntity = (MyBeanEntity) entityManager.find(MyBeanEntity.class, id);

            if(myBeanEntity!=null){
                myBean=convertEntityToBean(myBeanEntity);
            }

        } catch (Exception exception) {

            throw exception;
        }

        return myBean;
    }


    public static MyBean convertEntityToBean(MyBeanEntity entity){
        MyBean bean = new MyBean();
        BeanUtils.copyProperties(entity, bean);
        return bean;
    }
    public static MyBeanEntity convertBeanToEntity(MyBean bean){
        MyBeanEntity entity = new MyBeanEntity();
        BeanUtils.copyProperties(bean,entity);
        return entity;
    }
}

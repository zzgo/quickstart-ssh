package com.zachary.ssm.dao.impl;

import com.zachary.ssm.dao.UserDaoCustom;
import com.zachary.ssm.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/2/18
 **/
public class UserDaoImpl implements UserDaoCustom {
    @PersistenceContext
    private EntityManager em;

    @Override
    public User findById(String id) {
        User user = (User) em.createQuery(" FROM User u where  u.id ='1'").getSingleResult();
        return user;
    }
}

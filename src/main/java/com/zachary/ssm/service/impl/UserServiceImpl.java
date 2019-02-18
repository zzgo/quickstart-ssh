package com.zachary.ssm.service.impl;

import com.zachary.ssm.dao.UserDao;
import com.zachary.ssm.entity.User;
import com.zachary.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/2/18
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User update(User user) {
        return userDao.save(user);
    }

    @Override
    public int delete(String s) {
        userDao.delete(s);
        return 1;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(String id) {
        return userDao.findById(id);
    }
}

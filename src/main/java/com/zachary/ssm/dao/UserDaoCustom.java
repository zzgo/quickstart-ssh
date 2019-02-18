package com.zachary.ssm.dao;

import com.zachary.ssm.entity.User;

public interface UserDaoCustom {
    User findById(String id);
}

package com.zachary.ssm.service;

import com.zachary.ssm.entity.User;

public interface UserService extends BaseService<User, String> {
    User findOne(String id);
}

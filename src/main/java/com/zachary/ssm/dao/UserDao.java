package com.zachary.ssm.dao;

import com.zachary.ssm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,String>,UserDaoCustom{

}

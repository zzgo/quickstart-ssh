package com.zachary.ssm.entity;

import com.zachary.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setId("1");
        user.setName("2");
        user.setPassword("3");
        System.out.println(userService.save(user));
    }


    @Test
    public void findById() {
        System.out.println(userService.findOne("1"));
    }
}
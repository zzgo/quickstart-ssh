package com.zachary.ssm.controller;

import com.zachary.ssm.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @RequestMapping(value = "get")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setName("admin");
        user.setPassword("123456");
        return user;
    }
    @RequestMapping(value = "test")
    public ModelAndView mv() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/test");
        modelAndView.addObject("test", "test");
        return modelAndView;
    }
}

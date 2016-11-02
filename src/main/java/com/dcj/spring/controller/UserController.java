package com.dcj.spring.controller;

import com.dcj.spring.pojo.*;
import com.dcj.spring.service.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.*;

/**
 * Created by dcj on 2016/10/22.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser/{id}")
    @ResponseBody
    public User toIndex(@PathVariable int id){
        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("/gotoShow")
    public String gotoShow(){
        return "showUser";
    }
}

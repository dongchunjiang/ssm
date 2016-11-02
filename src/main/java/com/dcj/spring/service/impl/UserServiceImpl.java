package com.dcj.spring.service.impl;

import com.dcj.spring.dao.*;
import com.dcj.spring.pojo.*;
import com.dcj.spring.service.*;
import org.springframework.stereotype.*;

import javax.annotation.*;

/**
 * Created by dcj on 2016/10/22.
 */
@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private UserMapper userMapper = null;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}

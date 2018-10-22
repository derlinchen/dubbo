package com.climber.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.climber.bean.User;
import com.climber.service.UserService;

public class UserServiceImpl implements UserService {

    /**
     * 这里通过模拟查询数据库返回用户信息
     */
    public List<User> queryAll() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
                User user = new User();
                user.setAge(10 + i);
                user.setId(Long.valueOf(i + 1));
                user.setPassword("123456");
                user.setUsername("username_" + i);
                list.add(user);
        }
        return list;
    }


}

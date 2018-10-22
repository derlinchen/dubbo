package com.climber.service;

import java.util.List;

import com.climber.bean.User;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryAll();
}

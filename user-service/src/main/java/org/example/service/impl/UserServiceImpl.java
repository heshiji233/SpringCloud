package org.example.service.impl;/*
@author 何世吉
*/

import jakarta.annotation.Resource;
import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper mapper;
    @Override
    public User getUserById(int uid) {
        return mapper.getUserById(uid);
    }
}

package com.aaa.service;

import com.aaa.entity.User;
import com.aaa.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 钱浩洋
 * @date 2020/2/19 - 17:44
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    UserMapper userMapper;
    @Override
    public User findByName(String username) {
        return userMapper.findByName(username);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}

package com.aaa.service;

import com.aaa.entity.User;

/**
 * @author 钱浩洋
 * @date 2020/2/19 - 17:42
 */
public interface UserService {
    User findByName(String username);
    User findById(Integer id);
}

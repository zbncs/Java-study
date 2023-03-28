package org.example.dao;

import org.example.pojo.User;

import java.util.List;

public interface UserMapper {
    // 查
    List<User> queryAllUsers();
    User queryUserById(Integer id);
    // 增
    void addUser(User user);
    // 改
    void updateUser(User user);
    // 删
    void deleteUser(Integer id);
}

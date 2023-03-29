package org.example.dao;

import org.apache.ibatis.annotations.Param;
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

    // 动态SQL
    // 1.查询男性用户，如果如数用户名，模糊查询，否则之差男性用户
    List<User> queryUsersBySexOrUserName(@Param("userName") String userName);

    // 2. 多条件查询：choose when otherwise
    List<User> queryUsersBySexOrUserNameOrAddr(@Param("userName") String userName, @Param("address") String address);

    // 3.where
    List<User> queryUsersByUserNameAndAddress(@Param("userName") String userName, @Param("address") String address);

    // 4.set标签：在update语句中,可以自动添加一个set关键字，并且会将动态sql最后多余的逗号去除。
    void updateUserById(User user);

    // 5.foreach
    List<User> findByIds(@Param("ids") List<Integer> ids);

}

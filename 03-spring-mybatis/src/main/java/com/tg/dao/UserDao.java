package com.tg.dao;

import com.tg.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //查询所有用户
    List<User> selectAll();
    //根据Id查找用户
    User selectById(Integer id);
    //通过对象插入用户
    int insertOne(User user);
    //通过参数查找对象
    //List<User> selectByParam(@Param("sex")  String sex,@Param("userName") String userName);
    List<User> selectByParam(String sex, String userName);
}

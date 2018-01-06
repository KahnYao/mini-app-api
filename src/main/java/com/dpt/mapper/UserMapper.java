package com.dpt.mapper;

import com.dpt.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE nickName = #{nickName}")
    User getUserByName(@Param("nickName") String name);

    @Select("SELECT * FROM user WHERE id = #{id}")
    User getUserById(Integer id);

    @Select("SELECT * FROM user WHERE openId = #{openId}")
    User getUserByOpenId(String openId);

    @Select("SELECT * FROM user WHERE 1=1 ")
    List<User> getUsers();

    @Insert("INSERT INTO user(id,openId,nickName,gender,language,country,province,city,avatarUrl,unionId,sessionKey,createdTime,updatedTime) " +
            "VALUES(#{id}, #{openId}, #{nickName},#{gender}, #{language}, #{country},#{province}, #{city}, #{avatarUrl},#{unionId}, #{sessionKey}, #{createdTime}, #{updatedTime})")
    int insert(User user);

    @Update("UPDATE user SET age=#{age}, name=#{name} WHERE id=#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(int id);

    @Results({@Result(property = "name", column = "name"), @Result(property = "age", column = "age")})
    @Select("SELECT name,age FROM user WHERE 1=1")
    List<User> queryById();

}
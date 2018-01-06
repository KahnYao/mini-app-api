package com.dpt.mapper;

import com.dpt.model.Technician;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TechnicianMapper {
    @Select("SELECT * FROM technician WHERE id = #{id}")
    Technician getTechnicianById(Integer id);

    @Select("SELECT * FROM technician WHERE 1=1 ")
    List<Technician> getTechnicians();

    @Insert("INSERT INTO technician(id, openId, realname, avatar, mobile, experience, adept, city, verify, shopName, referee, amount, createdTime, updatedTime) " +
            "VALUES(#{id}, #{openId}, #{realname}, #{avatar}, #{mobile}, #{experience}, #{adept}, #{city}, #{verify}, #{shopName}, #{referee}, #{amount}, #{createdTime}, #{updatedTime})")
    int insert(Technician technician);

    @Update("UPDATE technician SET age=#{age}, name=#{name} WHERE id=#{id}")
    void update(Technician technician);

    @Delete("DELETE FROM technician WHERE id =#{id}")
    void delete(int id);
}
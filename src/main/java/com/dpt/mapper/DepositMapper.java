package com.dpt.mapper;

import com.dpt.model.Deposit;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepositMapper {

    @Insert("INSERT INTO technician(id, openId, realname, avatar, mobile, experience, adept, city, verify, shopName, referee, amount, createdTime, updatedTime) " +
            "VALUES(#{id}, #{openId}, #{realname}, #{avatar}, #{mobile}, #{experience}, #{adept}, #{city}, #{verify}, #{shopName}, #{referee}, #{amount}, #{createdTime}, #{updatedTime})")
    int insert(Deposit deposit);

}
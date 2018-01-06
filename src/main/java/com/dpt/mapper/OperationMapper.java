package com.dpt.mapper;

import com.dpt.model.Operation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OperationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Operation record);

    int insertSelective(Operation record);

    Operation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Operation record);

    int updateByPrimaryKey(Operation record);
}
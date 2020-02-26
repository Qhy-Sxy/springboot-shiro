package com.aaa.mapper;

import com.aaa.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 钱浩洋
 * @date 2020/2/19 - 17:40
 */
@Mapper
public interface UserMapper {
   @Select("select * from user where username=#{username}")
    User findByName(@Param("username")String username);
   @Select("select * from user where id=#{value}")
    User findById(Integer id);
}

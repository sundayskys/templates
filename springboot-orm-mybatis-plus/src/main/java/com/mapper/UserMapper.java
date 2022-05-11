package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Date 2021-12-17 17:58
 * @Description TODO
 */


@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAllUser();

    @Select("select * from user where name = #{name} ")
    User findByName(@Param("name") String name);


}

package com.lhb.springsecuritydemo.dao;

import com.lhb.springsecuritydemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectByName(String username);

}

package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.SysUser;

@Mapper
public interface UserMapper {
    public SysUser selectUserbyusername(String username);
    public int inserUser(SysUser user);
    
}

package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.swjtuhc.demo.model.sysuser;

@Mapper
public interface changermapper {
	public sysuser selctbynamepswSysuserageSysuser (@Param("username") String username,@Param("password") int password, @Param("age") int age);
	public int updatepwd(@Param("user") sysuser user, @Param("newpasswrod") Integer newpasswrod);
}

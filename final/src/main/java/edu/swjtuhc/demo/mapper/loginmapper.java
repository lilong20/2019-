package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.swjtuhc.demo.model.sysuser;
@Mapper
public interface loginmapper {
	public sysuser finduserfromnamepasswrd(@Param("username") String username,@Param("password") int password);
}

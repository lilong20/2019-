package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.omg.CORBA.PUBLIC_MEMBER;

import edu.swjtuhc.demo.model.sysuser;

@Mapper
public interface usermapper {
	public sysuser selectSysuserbyusername(String username);
	public int insertuser(sysuser user);
	
}

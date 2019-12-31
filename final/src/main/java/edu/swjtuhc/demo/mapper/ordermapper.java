package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.order;
import edu.swjtuhc.demo.model.sysuser;
@Mapper
public interface ordermapper {
public int addoder(order order);

}

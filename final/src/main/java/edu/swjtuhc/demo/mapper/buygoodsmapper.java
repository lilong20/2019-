package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.swjtuhc.demo.model.goods;
@Mapper
public interface buygoodsmapper {
public goods selectgoodssnamenumber(@Param("goodsname") String goodsname,@Param("goodsnumber") int goodsnumber );
public int buygoods(@Param("goods") goods goods,@Param("p") Integer p);
}

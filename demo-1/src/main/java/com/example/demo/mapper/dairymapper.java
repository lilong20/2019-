package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.dairy;

@Mapper
public interface dairymapper {
	public List<dairy> selectAllDairies();
	public int insertdairy(dairy dairy);
}

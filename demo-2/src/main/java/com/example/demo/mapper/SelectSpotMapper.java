package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.SelectSpot;

@Mapper
public interface SelectSpotMapper {
   public SelectSpot selectSpotByViewname(String viewname);

;
}

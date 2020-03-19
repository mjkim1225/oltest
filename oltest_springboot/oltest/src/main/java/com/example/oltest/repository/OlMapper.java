package com.example.oltest.repository;


import com.example.oltest.model.Emd;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OlMapper {

	// Emd findPositionByPoint(Coor point);
	Emd findPositionByPoint(String point);
    
    
}
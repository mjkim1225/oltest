package com.example.oltest.repository;


import java.util.List;

import com.example.oltest.model.Emd;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OlMapper {

	Emd findPositionByPoint(String pointStr);

	int insertPoint(String pointStr);

	List<Emd> findemdIncludingPoint();
    
    
}
package com.example.oltest.service;


import java.util.List;

import com.example.oltest.model.Coor;
import com.example.oltest.model.Emd;
import com.example.oltest.repository.OlMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class OlService {

    @Autowired
    private OlMapper olMapper;

	public Emd findPositionByPoint(Coor point) {
        String pointStr= "POINT("+point.getLon()+" "+point.getLat()+")";
        log.info("point str : "+pointStr);
        return olMapper.findPositionByPoint(pointStr);
	}

	public int insertPoint(Coor point) {
		String pointStr= "POINT("+point.getLon()+" "+point.getLat()+")";
        log.info("point str : "+pointStr);
        return olMapper.insertPoint(pointStr);
	}

	public List<Emd> findemdIncludingPoint() {
		return olMapper.findemdIncludingPoint();
	}

  
    
}
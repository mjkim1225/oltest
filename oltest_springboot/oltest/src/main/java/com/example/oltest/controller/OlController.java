package com.example.oltest.controller;

import com.example.oltest.model.Coor;
import com.example.oltest.model.Emd;
import com.example.oltest.service.OlService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class OlController{

    @Autowired
    private OlService olService;

    @GetMapping("/oltest")
    public ResponseEntity<?> findPositionByPoint(Coor point) {
        log.info("#####################"+point.getLat());
        Emd emd = olService.findPositionByPoint(point);

        return new ResponseEntity<>(emd, HttpStatus.OK);
    }


}
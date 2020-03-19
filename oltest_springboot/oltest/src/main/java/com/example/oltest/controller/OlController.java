package com.example.oltest.controller;

import java.util.List;

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
        log.info("/oltest : lat - "+point.getLat()+", lon - "+point.getLon());
        Emd emd = olService.findPositionByPoint(point);
        
        if(emd == null){
            return new ResponseEntity<>("no data", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(emd, HttpStatus.OK);
    }

    @GetMapping("/emd/show")
    public ResponseEntity<?> findemdIncludingPoint() {
        List<Emd> emds = olService.findemdIncludingPoint();
        
        if(emds == null){
            return new ResponseEntity<>("no data", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(emds, HttpStatus.OK);
    }

    @GetMapping("/point/check")
    public ResponseEntity<?> checkPoint(Coor point) {
        log.info("/point/check : lat - "+point.getLat()+", lon - "+point.getLon());
        Emd emd = olService.findPositionByPoint(point);

        if(emd == null){
            return new ResponseEntity<>("no data", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(emd, HttpStatus.OK);
    }

    @GetMapping("/point/add")
    public ResponseEntity<?> addPoint(Coor point) {
        log.info("/point/add : lat - "+point.getLat()+", lon - "+point.getLon());
        olService.insertPoint(point);

        return new ResponseEntity<>("ok", HttpStatus.OK);
    }


}
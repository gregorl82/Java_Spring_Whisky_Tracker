package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistilleryController {

    @Autowired
    private DistilleryRepository distilleryRepository;

    @GetMapping(value = "/distilleries")
    public ResponseEntity<List<Distillery>> getAllDistilleries(){
        return new ResponseEntity<>(distilleryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/distilleries/region")
    public ResponseEntity<List<Distillery>> findDistilleryByRegion(@RequestParam(name = "region") String region){
        List<Distillery> distilleries = distilleryRepository.findDistilleryByRegion(region);
        return new ResponseEntity<>(distilleries, HttpStatus.OK);
    }

    @GetMapping(value = "/distilleries/whiskies/age")
    public ResponseEntity<List<Distillery>> findByWhiskyAge(@RequestParam(name = "age") int age){
        List<Distillery> distilleries = distilleryRepository.findByWhiskiesAge(age);
        return new ResponseEntity<>(distilleries, HttpStatus.OK);
    }

}

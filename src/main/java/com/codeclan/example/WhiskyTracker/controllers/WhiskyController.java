package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    private WhiskyRepository whiskyRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> getAllWhiskies() {
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/year")
    public ResponseEntity<List<Whisky>> findByYear(@RequestParam(name = "year") int year){
        List<Whisky> foundWhiskies = whiskyRepository.findByYear(year);
        return new ResponseEntity<>(foundWhiskies, HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/distilleries")
    public ResponseEntity<List<Whisky>> findByDistilleryNameAndAge(@RequestParam(name = "name") String name, @RequestParam(name = "age") int age){
        List<Whisky> foundWhiskies = whiskyRepository.findByDistilleryNameAndAge(name, age);
        return new ResponseEntity<>(foundWhiskies, HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/distilleries/region")
    public ResponseEntity<List<Whisky>> findByDistilleryRegion(@RequestParam(name = "region") String region){
        List<Whisky> foundWhiskies = whiskyRepository.findByDistilleryRegion(region);
        return new ResponseEntity<>(foundWhiskies, HttpStatus.OK);
    }

}

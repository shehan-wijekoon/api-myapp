package com.example.myapp.controller;

import com.example.myapp.model.ads;
import com.example.myapp.service.adsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ads")
@CrossOrigin
public class adsController {

    @Autowired
    private adsService adsService;

    @PostMapping("/add")
    public String add(@RequestBody ads ads) {
        adsService.saveads(ads);
        return "new ad is added";
    }

    @GetMapping("/get")
    public List<ads> getads() {
        return adsService.getAllads();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        try{
            adsService.deleteadsById(id);
            return ResponseEntity.ok("ad with id"+id+" is deleted.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}

package com.example.myapp.controller;

import com.example.myapp.model.ads;
import com.example.myapp.service.adsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ads")
public class adsController {

    @Autowired
    private adsService adsService;

    @PostMapping("/add")
    public String add(@RequestBody ads ads) {
        adsService.saveads(ads);
        return "new ad is added";
    }
}

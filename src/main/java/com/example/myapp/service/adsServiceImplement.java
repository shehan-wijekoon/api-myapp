package com.example.myapp.service;

import com.example.myapp.model.ads;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.myapp.repository.adsRepository;
import org.springframework.stereotype.Service;

@Service
public class adsServiceImplement implements adsService {

    @Autowired
    private adsRepository adsRepository;

    @Override
    public ads saveads(ads ads) {
        return adsRepository.save(ads);
    }
}

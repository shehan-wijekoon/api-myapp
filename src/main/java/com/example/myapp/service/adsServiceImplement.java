package com.example.myapp.service;

import com.example.myapp.model.ads;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.myapp.repository.adsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adsServiceImplement implements adsService {

    @Autowired
    private adsRepository adsRepository;

    @Override
    public ads saveads(ads ads) {
        return adsRepository.save(ads);
    }

    @Override
    public List<ads> getAllads() {
        return adsRepository.findAll();
    }

    @Override
    public void deleteadsById(int id) {
        if(adsRepository.existsById(id)) {
            adsRepository.deleteById(id);
        }else {
            throw new IllegalArgumentException("No ads with id " + id + " exists");
        }
    }
}

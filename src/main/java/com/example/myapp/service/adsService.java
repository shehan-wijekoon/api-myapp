package com.example.myapp.service;

import com.example.myapp.model.ads;

import java.util.List;

public interface adsService {

    public ads saveads(ads ads);

    public List<ads> getAllads();

    public void deleteadsById(int id);
}

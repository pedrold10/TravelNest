package com.travel.nest.travelnest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.nest.travelnest.model.Hotel;
import com.travel.nest.travelnest.repository.HotelRepository;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHoteis() {
        return this.hotelRepository.findAll();
    }
}

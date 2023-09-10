package com.travel.nest.travelnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.nest.travelnest.model.Hotel;
import com.travel.nest.travelnest.service.HotelService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/hoteis")
@RequiredArgsConstructor
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> listaHoteis() {
        return this.hotelService.getAllHoteis();
    }

}

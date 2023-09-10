package com.travel.nest.travelnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.nest.travelnest.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}

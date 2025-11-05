package com.microservice.hotel.services.impl;

import com.microservice.hotel.entities.Hotel;
import com.microservice.hotel.exceptions.ResourceNotFoundException;
import com.microservice.hotel.repositories.HotelRepository;
import com.microservice.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Hotel with given id: " + id + " not found."));
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }
}

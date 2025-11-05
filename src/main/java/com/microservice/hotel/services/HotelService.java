package com.microservice.hotel.services;

import com.microservice.hotel.entities.Hotel;

import java.util.List;


public interface HotelService {
    Hotel createHotel(Hotel hotel);
    Hotel getHotel(String id);
    List<Hotel> getHotels();
}

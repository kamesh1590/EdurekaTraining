package com.edureka.training.session3.HotelService.service;

import com.edureka.training.session3.HotelService.entities.Hotel;
import com.edureka.training.session3.HotelService.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> fetchAll(int pageNo, int pageSize) {
        return hotelRepository.findAll(PageRequest.of(pageNo, pageSize)).getContent();
    }

    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}

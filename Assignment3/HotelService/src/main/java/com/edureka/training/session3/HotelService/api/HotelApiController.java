package com.edureka.training.session3.HotelService.api;

import com.edureka.training.session3.HotelService.entities.Hotel;
import com.edureka.training.session3.HotelService.service.HotelService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@Slf4j
public class HotelApiController implements HotelApi {

    private final HotelService hotelService;

    @Autowired
    public HotelApiController(ObjectMapper objectMapper, HttpServletRequest request, HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @Override
    public ResponseEntity<List<Hotel>> hotelGet(int pageNo, int pageSize) {
        return ResponseEntity.ok().body(hotelService.fetchAll(pageNo, pageSize));
    }

    @Override
    public ResponseEntity<Hotel> hotelPost(@Valid Hotel body) {
        log.info("Added a new hotel to the repo.");
        return ResponseEntity.accepted().body(hotelService.addHotel(body));
    }
}

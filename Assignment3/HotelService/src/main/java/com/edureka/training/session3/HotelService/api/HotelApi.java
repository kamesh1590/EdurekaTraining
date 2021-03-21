/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.edureka.training.session3.HotelService.api;

import com.edureka.training.session3.HotelService.entities.Hotel;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Validated
@Api(value = "hotel", description = "the hotel API")
@RequestMapping(value = "api/v1")
public interface HotelApi {

    @ApiOperation(value = "Retrieve hotels", nickname = "hotelGet", notes = "", response = Hotel.class, tags = {"Hotel",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetch hotels from database", response = Hotel.class)})
    @RequestMapping(value = "/hotel",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.GET)
    ResponseEntity<List<Hotel>> hotelGet();


    @ApiOperation(value = "Add a new hotel", nickname = "hotelPost", notes = "", response = Hotel.class, tags = {"Hotel",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Added succesfully", response = Hotel.class),
            @ApiResponse(code = 405, message = "Invalid input", response = Error.class)})
    @RequestMapping(value = "/hotel",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.POST)
    ResponseEntity<Hotel> hotelPost(@ApiParam(value = "", required = true) @Valid @RequestBody Hotel body);

}

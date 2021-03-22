/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.edureka.training.session4.BankService.api;

import com.edureka.training.session4.BankService.entities.Customer;
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
@Api(value = "Bank Customer")
@RequestMapping(value = "api/v1")
public interface CustomerApi {

    @ApiOperation(value = "Retrieve all customer", nickname = "retrieveCustomer", notes = "", response = Customer.class, tags = {"Customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetch customers from database", response = Customer.class)})
    @RequestMapping(value = "/customer",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.GET)
    ResponseEntity<List<Customer>> retrieveCustomer();

    @ApiOperation(value = "Add a new customer", nickname = "createCustomer", notes = "", response = Customer.class, tags = {"Customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Added successfully", response = Customer.class),
            @ApiResponse(code = 405, message = "Invalid input", response = Error.class)})
    @RequestMapping(value = "/customer",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.POST)
    ResponseEntity<Customer> createCustomer(@ApiParam(value = "", required = true) @Valid @RequestBody Customer body);

    @ApiOperation(value = "Update a customer", nickname = "updateCustomer", notes = "", response = Customer.class, tags = {"Customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Added successfully", response = Customer.class),
            @ApiResponse(code = 405, message = "Invalid input", response = Error.class)})
    @RequestMapping(value = "/customer",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.PUT)
    ResponseEntity<Customer> updateCustomer(@ApiParam(value = "", required = true) @Valid @RequestBody Customer body);

}
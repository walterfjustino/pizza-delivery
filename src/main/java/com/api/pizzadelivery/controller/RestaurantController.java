/*
package com.api.pizzadelivery.controller;

import javax.validation.Valid;

import com.api.pizzadelivery.dto.MessageResponseDTO;

import com.api.pizzadelivery.exception.RestaurantNotFoundException;
import com.api.pizzadelivery.restaurants.entity.Restaurant;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/restaurants")
public class RestaurantController {

    //private final RestaurantServiceImpl restaurantServiceImpl;

    //@Autowired
    //public RestaurantController(RestaurantServiceImpl restaurantServiceImpl) {
 //      this.restaurantServiceImpl = restaurantServiceImpl;

  //  }

    @ApiOperation(value = "Return the creation of restaurant")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Restaurant created")
    })
    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity findall(){

        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
*/

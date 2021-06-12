package com.api.pizzadelivery.controller;

import javax.validation.Valid;

import com.api.pizzadelivery.dto.MessageResponseDTO;
import com.api.pizzadelivery.dto.RestaurantDTO;
import com.api.pizzadelivery.exception.RestaurantNotFoundException;
import com.api.pizzadelivery.service.RestaurantServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/restaurants")
public class RestaurantController {

    private final RestaurantServiceImpl restaurantServiceImpl;

    @Autowired
    public RestaurantController(RestaurantServiceImpl restaurantServiceImpl) {
        this.restaurantServiceImpl = restaurantServiceImpl;

    }

    @ApiOperation(value = "Return the creation of restaurant")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Restaurant created")
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid RestaurantDTO restaurantDTO) throws RestaurantNotFoundException {

        return restaurantServiceImpl.create(restaurantDTO);
    }
}

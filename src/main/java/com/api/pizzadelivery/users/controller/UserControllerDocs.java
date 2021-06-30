package com.api.pizzadelivery.users.controller;

import com.api.pizzadelivery.users.dto.UserDTO;
import com.api.pizzadelivery.users.exception.UserAlreadyExistsException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Api("Users management")
public interface UserControllerDocs {

    @ApiOperation(value = "User creation operation")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success user creation"),
            @ApiResponse(code = 400, message = "Missing required fields, wrong field range value or user already registered on system")
    })
    public UserDTO create(UserDTO userDTO) throws UserAlreadyExistsException;
}

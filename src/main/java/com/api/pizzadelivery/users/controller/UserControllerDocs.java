package com.api.pizzadelivery.users.controller;

import com.api.pizzadelivery.users.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api("Users management")
public interface UserControllerDocs {

    @ApiOperation(value = "User creation operation")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success user creation"),
            @ApiResponse(code = 400, message = "Missing required fields, wrong field range value or user already registered on system")
    })
    ResponseEntity<UserDTO> save (UserDTO userDTO);


    @ApiOperation(value = "Find all users operation")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success users found"),

    })
    public ResponseEntity <List<UserDTO>> findAll();


    @ApiOperation(value = "Find user by id operation")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success user found"),
            @ApiResponse(code = 404, message = "User not found error code")
    })
    ResponseEntity<UserDTO> getUserById(Long id);

}

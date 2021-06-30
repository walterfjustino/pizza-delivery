/*
package com.api.pizzadelivery.utils;

import com.api.pizzadelivery.users.dto.UserDTO;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonConversionUtils {

    public static String asJsonString(UserDTO expectedCreatedUserDTO) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            objectMapper.registerModules(new JavaTimeModule());
        return objectMapper.writeValueAsString(expectedCreatedUserDTO);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
*/

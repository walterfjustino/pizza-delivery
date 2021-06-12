package com.api.pizzadelivery.mapper;

import com.api.pizzadelivery.dto.RestaurantDTO;
import com.api.pizzadelivery.entity.Restaurant;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant toModel(RestaurantDTO restaurantDTO);

    RestaurantDTO toDTO(Restaurant restaurant);

}
    

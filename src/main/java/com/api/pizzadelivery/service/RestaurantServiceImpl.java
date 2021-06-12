package com.api.pizzadelivery.service;

import com.api.pizzadelivery.dto.MessageResponseDTO;
import com.api.pizzadelivery.dto.RestaurantDTO;
import com.api.pizzadelivery.entity.Restaurant;
import com.api.pizzadelivery.exception.RestaurantNotFoundException;
import com.api.pizzadelivery.mapper.RestaurantMapper;
import com.api.pizzadelivery.repository.RestaurantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


@Service
public class RestaurantServiceImpl implements RestaurantService {

    
    private RestaurantRepository restaurantRepository;

    private final RestaurantMapper restaurantMapper = RestaurantMapper.INSTANCE;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public RestaurantDTO findById(Long id) throws RestaurantNotFoundException {
        Restaurant restaurant = restaurantRepository.findById(id).orElseThrow(() -> new RestaurantNotFoundException(id));
        return restaurantMapper.toDTO(restaurant);
    }

    @Override
    public RestaurantDTO findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @PostMapping
    public MessageResponseDTO create(RestaurantDTO restaurantDTO) throws RestaurantNotFoundException {
        restaurantRepository.findById(restaurantDTO.getId()).orElseThrow();
       
        Restaurant restaurantToSave = restaurantMapper.toModel(restaurantDTO);
       
        Restaurant savedRestaurant = restaurantRepository.save(restaurantToSave);
       
        return MessageResponseDTO.builder().httpStatus(HttpStatus.CREATED)
                .message("Restaurant created with ID" + savedRestaurant.getId()).build();

    }

    @Override
    public MessageResponseDTO update(RestaurantDTO restaurantDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MessageResponseDTO delete(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
}

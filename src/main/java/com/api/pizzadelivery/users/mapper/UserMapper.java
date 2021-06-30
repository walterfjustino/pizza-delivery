package com.api.pizzadelivery.users.mapper;


import com.api.pizzadelivery.users.dto.UserDTO;
import com.api.pizzadelivery.users.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toModel(UserDTO userDTO);

    UserDTO toDTO(User user);
}





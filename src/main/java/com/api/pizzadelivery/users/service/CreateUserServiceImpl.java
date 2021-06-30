package com.api.pizzadelivery.users.service;

import com.api.pizzadelivery.users.dto.UserDTO;

import com.api.pizzadelivery.users.entity.User;
import com.api.pizzadelivery.users.exception.UserAlreadyExistsException;
import com.api.pizzadelivery.users.mapper.UserMapper;
import com.api.pizzadelivery.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CreateUserServiceImpl implements CreateUserService {


    private final static UserMapper userMapper = UserMapper.INSTANCE;
    private final UserRepository userRepository;


    @Override
    public UserDTO save(UserDTO userDTO) {
        userRepository.findByNameOrEmail(
                userDTO.getName(), userDTO.getEmail())
                .ifPresent(user ->
                { throw new UserAlreadyExistsException(user.getName(), user.getEmail());
                });

        User userToSave = userMapper.toModel(userDTO);
        User userSaved = userRepository.save(userToSave);
        return userMapper.toDTO(userSaved);
    }


    }











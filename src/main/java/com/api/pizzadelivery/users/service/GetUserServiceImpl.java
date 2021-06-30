
package com.api.pizzadelivery.users.service;

import com.api.pizzadelivery.users.entity.User;
import com.api.pizzadelivery.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class GetUserServiceImpl implements GetUserService{

    private final UserRepository userRepository;

    @Autowired
    public GetUserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


   /* @Override
    public List<User> findAll() {

        return userRepository.findAll();
    }*/


    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "User NOT FOUND"));


    }


}


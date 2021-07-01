
package com.api.pizzadelivery.users.service;

import com.api.pizzadelivery.users.dto.UserDTO;
import com.api.pizzadelivery.users.entity.User;

import java.util.List;

public interface GetUserService {

    List<UserDTO> findAll();

    //User findById(Long id);

    UserDTO findById(Long id);
}




package com.api.pizzadelivery.users.service;

import com.api.pizzadelivery.users.dto.UserDTO;
import com.api.pizzadelivery.users.entity.User;
import com.api.pizzadelivery.users.exception.UserNotFoundException;
import com.api.pizzadelivery.users.mapper.UserMapper;
import com.api.pizzadelivery.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class GetUserServiceImpl implements GetUserService{

    private final static UserMapper userMapper = UserMapper.INSTANCE;
    private final UserRepository userRepository;


   @Override
    public List<UserDTO> findAll() {

       return userRepository.findAll()
               .stream()
               .map(userMapper::toDTO)
               .collect(Collectors.toList());  //para cada entidade retornada pelo findAll,
    }                                         //o map converte para o toDTO,
                                              //com isso converte todos os retornos de uma lista de padrao DTO, para entidade

  /*  @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "User NOT FOUND"));


    }*/

    @Override
    public UserDTO findById(Long id) {
       User findUser = userRepository.findById(id)
               .orElseThrow(() -> new UserNotFoundException(id));
        return userMapper.toDTO(findUser);
    }


}


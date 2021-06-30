/*
package com.api.pizzadelivery.users.service;

import com.api.pizzadelivery.users.builder.UserDTOBuilder;
import com.api.pizzadelivery.users.dto.UserDTO;
import com.api.pizzadelivery.users.entity.User;
import com.api.pizzadelivery.users.exception.UserAlreadyExistsException;
import com.api.pizzadelivery.users.exception.UserEmailAlreadyExistsException;
import com.api.pizzadelivery.users.mapper.UserMapper;
import com.api.pizzadelivery.users.repository.UserRepository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    private final static UserMapper userMapper = UserMapper.INSTANCE;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    private UserDTOBuilder userDTOBuilder;

    @BeforeEach
    void setUp() {
        userDTOBuilder = UserDTOBuilder.builder().build();
    }

  /*  //Sucessfull
    @Test
    void whenNewUserIsInformedThenItShouldBeCreated() {
        //GIVEN
        UserDTO expectedUserToCreateDTO = userDTOBuilder.buildUserDTO();
        User expectedCreatedUser = userMapper.(expectedUserToCreateDTO);

        //WHEN
        Mockito.when(userRepository.save(expectedCreatedUser)).thenReturn(expectedCreatedUser);
        Mockito.when(userRepository.findByName(expectedUserToCreateDTO.getName())).thenReturn(Optional.empty());
        Mockito.when(userRepository.findByEmail(expectedUserToCreateDTO.getEmail())).thenReturn(Optional.empty());
        UserDTO createdUserDTO = userService.save(expectedUserToCreateDTO);

        //THEN
        MatcherAssert.assertThat(createdUserDTO, Is.is(IsEqual.equalTo(expectedUserToCreateDTO)));
    }*/

    //Insucessfull

  /*  @Test
    void whenExistingUserIsInformedThenAnExceptionShouldBeThrown()  {

        UserDTO expectedUserToCreateDTO = userDTOBuilder.buildUserDTO();
        User expectedCreatedUser = userMapper.toModel(expectedUserToCreateDTO);

        Mockito.when(userRepository.findByName(expectedUserToCreateDTO.getName()))
               .thenReturn(Optional.of(expectedCreatedUser)) ;
        Mockito.when(userRepository.findByEmail(expectedUserToCreateDTO.getEmail()))
               .thenReturn(Optional.of(expectedCreatedUser));


        Assertions.assertThrows(UserAlreadyExistsException.class, () -> userService.create(expectedUserToCreateDTO));
        Assertions.assertThrows(UserEmailAlreadyExistsException.class,  () -> userService.create(expectedUserToCreateDTO));
    }
}
*/

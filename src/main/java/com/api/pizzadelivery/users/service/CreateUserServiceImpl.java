package com.api.pizzadelivery.users.service;

import com.api.pizzadelivery.users.dto.UserDTO;

import com.api.pizzadelivery.users.entity.User;
import com.api.pizzadelivery.users.exception.UserAlreadyExistsException;
import com.api.pizzadelivery.users.mapper.UserMapper;
import com.api.pizzadelivery.users.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
//@RequiredArgsConstructor
public class CreateUserServiceImpl implements CreateUserService {


    private final static UserMapper userMapper = UserMapper.INSTANCE;
    private final UserRepository userRepository;

    public CreateUserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }


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

      /*     userRepository.findByName(userDTO.getName())
                   .ifPresentOrElse(user -> userRepository.findByEmail(user.getEmail()), () -> new UserAlreadyExistsException(userDTO.getEmail()));*/
 /*   private User getConvertUserToDtOorDtoToModel(UserDTO userDTO) {
        User userToSave = this.userMapper.toModel(userDTO);
        User userSaved = userRepository.save(userToSave);
        return userSaved;*/
    }

   /*     userRepository.findByEmail(userDTO.getEmail())
                .ifPresent(user -> {throw new UserEmailAlreadyExistsException(user.getEmail());
    }).;*/


  /*  @Override
    public ResponseEntity<UserDTO> update(UserDTO user) {
        return userRepository.findById(user.getId())
                .map(record -> {
                    record.setId(user.getId());
                    record.setName(user.getName());
                    record.setEmail(user.getEmail());
                    record.setPassword(user.getPassword());
                    record.setAdmin(record.isAdmin());
                    record.setCreatedDate(record.getCreatedDate());
                    record.setLastModifiedDate(record.getLastModifiedDate());
                    User updated = userRepository.save(record);
                    return ResponseEntity.ok()
                            .body(userMapper.toDTO(userRepository.save(userMapper.toModel(user))));
                }).orElse(ResponseEntity.notFound().build());
        //return userMapper.toDTO(userRepository.save(userMapper.toModel(user)));
    }*/







 /*   @Override
    @Transactional
    public User save(UserDTO userDTO) {
        String findUserEmail = userDTO.getEmail();
        userRepository.findByEmail(findUserEmail)
                .orElseThrow(() -> new UserEmailAlreadyExistsException(findUserEmail));

      User user = new User();
      user.setId(user.getId());
      user.setEmail(user.getEmail());
      user.setName(user.getName());
      user.setPassword(user.getPassword());
      user.setAdmin(user.isAdmin());

        return userRepository.save(user);
    }*/


package ru.student.cw2022.service;

import ru.student.cw2022.dto.UserDto;
import ru.student.cw2022.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail (String email);

    List<UserDto> findAllUsers();
}


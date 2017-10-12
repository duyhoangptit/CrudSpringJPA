package vn.cruddata.services;

import vn.cruddata.entities.UserDto;

import java.util.List;

/**
 * Created by hoangtd on 10/12/2017.
 */
public interface UserService {

    UserDto addUser(UserDto userDto);

    UserDto updateUser(UserDto userDto);

    Iterable<UserDto> findAll();

    List<UserDto> findUserByEmail(String email);

    void deleteUser(Integer userId);
}

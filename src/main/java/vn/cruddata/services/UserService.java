package vn.cruddata.services;

import vn.cruddata.entities.UserDto;

/**
 * Created by hoangtd on 10/12/2017.
 */
public interface UserService {

    UserDto addUser(UserDto userDto);

    Iterable<UserDto> findAll();
}

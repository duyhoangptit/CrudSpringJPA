package vn.cruddata.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.cruddata.daos.UserRepository;
import vn.cruddata.entities.UserDto;

import java.util.List;

/**
 * Created by hoangtd on 10/12/2017.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto addUser(UserDto userDto) {
        return userRepository.save(userDto);
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return userRepository.save(userDto);
    }

    @Override
    public Iterable<UserDto> findAll(){
        return userRepository.findAll();
    }

    @Override
    public List<UserDto> findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.delete(userId);
    }

}

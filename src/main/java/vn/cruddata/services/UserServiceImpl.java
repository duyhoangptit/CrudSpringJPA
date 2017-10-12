package vn.cruddata.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.cruddata.daos.UserRepository;
import vn.cruddata.entities.UserDto;

/**
 * Created by hoangtd on 10/12/2017.
 */
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto addUser(UserDto userDto) {
        return userRepository.save(userDto);
    }

    @Override
    public Iterable<UserDto> findAll(){
        return userRepository.findAll();
    }

}

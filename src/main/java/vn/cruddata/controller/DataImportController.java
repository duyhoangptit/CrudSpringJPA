package vn.cruddata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vn.cruddata.entities.UserDto;
import vn.cruddata.services.UserService;

/**
 * Created by hoangtd on 10/12/2017.
 */
@RestController
@RequestMapping(value = "import-data")
@Transactional
public class DataImportController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "add-user", method = RequestMethod.GET)
    public @ResponseBody
    UserDto addUser(){
        UserDto userDto = new UserDto("a","a",1,"a","a");
        userService.addUser(userDto);

        return userDto;
    }
}

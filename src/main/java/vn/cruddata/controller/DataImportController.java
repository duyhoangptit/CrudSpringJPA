package vn.cruddata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import vn.cruddata.entities.UserDto;
import vn.cruddata.services.UserService;

/**
 * Created by hoangtd on 10/12/2017.
 * API import data to database
 */
@RestController
@Transactional
@RequestMapping(value = "import-data")
public class DataImportController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "add-user", method = RequestMethod.GET)
    public @ResponseBody String addUser(){
        for(int i = 0;i<30;i++){
            UserDto userDto = new UserDto("A0000" + i,"A0000" + i,1,"A0000" + i,"A0000" + i);
            userService.addUser(userDto);
        }

        return "success";
    }

    @RequestMapping(value = "clean-data", method = RequestMethod.GET)
    public @ResponseBody String cleanData(){
        userService.deleteAllDataUser();

        return "success";
    }

}

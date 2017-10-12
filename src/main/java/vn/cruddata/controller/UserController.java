package vn.cruddata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.cruddata.services.UserService;

/**
 * Created by hoangtd on 10/12/2017.
 */
@RestController
@RequestMapping(value = "user-crud")
@Transactional
public class UserController {

    @Autowired
    private UserService userService;

}

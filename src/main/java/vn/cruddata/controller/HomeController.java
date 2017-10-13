package vn.cruddata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.cruddata.entities.UserDto;
import vn.cruddata.services.UserService;

/**
 * Created by hoangtd on 10/12/2017.
 */
@Controller
@RequestMapping(value = "home")
@Transactional
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String doHome(Model model){
        model.addAttribute("listUser", userService.findAll());
        model.addAttribute("command", new UserDto());

        return "index";
    }
}

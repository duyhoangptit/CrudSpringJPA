package vn.cruddata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.cruddata.entities.UserDto;
import vn.cruddata.services.UserService;

/**
 * Created by hoangtd on 10/12/2017.
 */
@Controller
@RequestMapping(value = "crud-user")
@Transactional
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "saveOrUpdate", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("userDto") UserDto userDto) {
        userService.addUser(userDto);

        return "redirect:/home/";
    }

    @RequestMapping(value = "delete/{userId}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("userId") Integer userId) {
        userService.deleteUser(userId);

        return "redirect:/home/";
    }

    @RequestMapping(value = "edit/{userId}", method = RequestMethod.GET)
    public String editUser(@PathVariable("userId") Integer userId, ModelMap modelMap) {
        modelMap.addAttribute("command", userService.getUserById(userId));

        return "edit";
    }

    @RequestMapping(value = "view/{userId}", method = RequestMethod.GET)
    public String viewUser(@PathVariable("userId") Integer userId, ModelMap modelMap) {
        modelMap.addAttribute("user", userService.getUserById(userId));

        return "view";
    }
}

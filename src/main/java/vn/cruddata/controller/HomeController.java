package vn.cruddata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.cruddata.services.UserService;

/**
 * Created by hoangtd on 10/12/2017.
 */
@Controller
@RequestMapping(value = "home")
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");

        mv.addObject("listUser", userService.findAll());

        return mv;
    }
}

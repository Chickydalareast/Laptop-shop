package vn.hoidanit.laptopshop.controller;

import java.util.*;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String userPage(Model model) {
        List<User> users = userService.getAll();
        model.addAttribute("user", users);
        return "home";
    }
    
}

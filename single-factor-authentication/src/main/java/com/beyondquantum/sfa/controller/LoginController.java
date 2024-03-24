package com.beyondquantum.sfa.controller;

import com.beyondquantum.sfa.dto.UserCredentialsDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(Model model) {
        UserCredentialsDto user = new UserCredentialsDto();
        model.addAttribute("user", user);
        return "loginPage";
    }
}

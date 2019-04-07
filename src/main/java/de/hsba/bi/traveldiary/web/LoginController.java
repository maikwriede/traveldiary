package de.hsba.bi.travel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login.html")
    public String index() {
        return "login";
    }
}


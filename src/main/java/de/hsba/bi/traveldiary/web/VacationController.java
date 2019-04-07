package de.hsba.bi.travel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VacationController {
    @GetMapping("/vacation.html")
    public String index() {
        return "vacation";
    }
}


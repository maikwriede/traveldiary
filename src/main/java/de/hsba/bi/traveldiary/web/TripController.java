package de.hsba.bi.travel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TripController {
    @GetMapping("/trip.html")
    public String index() {
        return "trip";
    }
}


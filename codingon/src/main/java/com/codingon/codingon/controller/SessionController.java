package com.codingon.codingon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@SessionAttributes("name3")
public class SessionController {
    @GetMapping("/session4")
    public String getSession4(@ModelAttribute("name3") Object obj) {
        return obj.toString();
    }
}

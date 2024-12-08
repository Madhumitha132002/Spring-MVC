package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class SessionController {
    @GetMapping("/setSession")
    public String setSession(Model model) {
        model.addAttribute("username", "JohnDoe");
        return "session";
    }

    @GetMapping("/getSession")
    public String getSession(Model model) {
        String username = (String) model.getAttribute("username");
        model.addAttribute("message", "Session username: " + username);
        return "session";
    }
}

package com.example.jenkins;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        log.info("Welcome Home Page!");

        model.addAttribute("message", getMessage());
        model.addAttribute("now", LocalDateTime.now());
        System.out.println(model.getAttribute("now"));
        return "index";
    }

    private String getMessage() {
        return "Welcome Home Page!!!\n" +
                "Korea went to 16강!";
    }
}

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteControlle {

    @GetMapping
    public String testa() {
        return "Ola mundoooo";
        return "Ola mundoooo";
        return "Ola mundoooo";
        return "Ola mundoooo";
    }
}

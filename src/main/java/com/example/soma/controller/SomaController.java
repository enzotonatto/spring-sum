package com.example.soma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SomaController {

    @GetMapping("/")
    public String showSumForm() {
        return "index";
    }

    @PostMapping("/")
    public String calculateSum(@RequestParam("numero1") int number1, 
                               @RequestParam("numero2") int number2, 
                               Model model) {
        int sum = number1 + number2;
        model.addAttribute("soma", sum);
        model.addAttribute("numero1", number1);
        model.addAttribute("numero2", number2);
        return "index";
    }
}

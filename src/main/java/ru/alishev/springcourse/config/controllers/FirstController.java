package ru.alishev.springcourse.config.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String HelloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model){

        model.addAttribute("message", "Hello " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/Calculator")
    public String CalculatorPage(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b,
                                 @RequestParam(value = "action") String action, Model model){
        double result = 0;
        if(action.equals("multiplication")){
            result = a * b;
        } else if (action.equals("division")) {
            result = a / b;
        } else if (action.equals("addition")) {
            result = a + b;
        } else if (action.equals("subtraction")) {
            result = a - b;
        }
        model.addAttribute("message", "Calculate: " + a + action + b + " = " + result);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }
}

package com.example.lab10_20200814.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/juego", method = RequestMethod.GET)
public class MainController {


    @GetMapping(value="")
    public String init(){
        return "juego";
    }
}

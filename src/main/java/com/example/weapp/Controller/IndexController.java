package com.example.weapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/index")
    public String Index(){
        return "Hello World!";
    }
    @RequestMapping("/demo")
    public String Demo(){
        return "I'm a demo";
    }
}

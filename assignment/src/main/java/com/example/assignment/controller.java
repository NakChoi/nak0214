package com.example.assignment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World!";
    }
}

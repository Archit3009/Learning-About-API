package com.learning.firsttimespring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstapihelloapi {

    @GetMapping
    public String hi(){
        return "hi i am archit";
    }
@GetMapping("/hello")
    public String hello(){
    return "Hello this is the first api designed by Archit Gupta";
}
}

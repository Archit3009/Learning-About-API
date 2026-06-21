package com.learning.firsttimespring;

import org.springframework.web.bind.annotation.*;

@RestController
public class firstapihelloapi {

    @GetMapping
    public HelloResponse hi(){
//        return "hi i am archit";
    return new HelloResponse("hi i am archit");
    }
@GetMapping("/hello")
    public String hello(){
    return "Hello this is the first api designed by Archit Gupta";
}
@PostMapping("/hello")
    public String posthello(@RequestBody String name){
        return "HELLO" + name + "You are destined to live a really beautiful life with everything and everyone you want with you";
}
}

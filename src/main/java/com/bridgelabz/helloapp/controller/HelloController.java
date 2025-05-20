package com.bridgelabz.helloapp.controller;

import com.bridgelabz.helloapp.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @RequestMapping(value = {"/query"})
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello " + name;
    }

    @RequestMapping(value = {"/parm/{name}"})
    public String sayHellobypath(@PathVariable String name){
        return "this msg from url Hello " + name;
    }

    @PostMapping("/post")
    public String sayhelloDto(@RequestBody UserDto user){
        return "Hello " + user.getFirstname() + " " + user.getLastname();
    }


}

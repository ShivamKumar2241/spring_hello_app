package com.bridgelabz.helloapp.controller;

import com.bridgelabz.helloapp.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {

    //uc1
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "hello from Bridgelabz";
    }

    //uc2
    @RequestMapping(value = {"/query"})
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

    //uc3
    @RequestMapping(value = {"/parm/{name}"}, method = RequestMethod.GET)
    public String sayHellobypath(@PathVariable String name) {
        return "this msg from url Hello " + name;
    }

    //uc4
    @PostMapping("/post")
    public String sayhelloDto(@RequestBody UserDto user) {
        return "Hello " + user.getFirstname() + " " + user.getLastname();
    }

    //uc5
    @PutMapping("/put/{firstname}")
    public String helloPUT(@PathVariable String firstname,
                           @RequestParam String lastname) {
        return "Hello " + firstname + " " + lastname;
    }
}

package com.ykb.training.spring.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    public String helloWorld() {
        return "Hello world from spring";
    }

    @GetMapping("/hello1")
    public String hello1(@RequestParam("n") String name,
                         @RequestParam("s") String surname) {
        return "Hello 1 " + name + " " + surname;
    }

    @GetMapping("/hello2/{name}/{surname}")
    public String hello2(@PathVariable("name")  String name,
                         @PathVariable("surname") String surname) {
        return "Hello 2 " + name + " " + surname;
    }

    @GetMapping("/hello3/{name}")
    public String hello3(@PathVariable("name")  String name,
                         @RequestParam("s") String surname) {
        return "Hello 3 " + name + " " + surname;
    }

}

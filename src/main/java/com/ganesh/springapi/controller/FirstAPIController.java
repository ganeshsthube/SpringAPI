package com.ganesh.springapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
// controller to interact with the client
public class FirstAPIController {
    @GetMapping("/hello/{name}/{times}")
    public  String hello (@PathVariable("name") String name, @PathVariable("times") int times) {
        String ans = "";
        for (int i = 0; i < times; i++) {
            ans += "Hello" + name + "!";
            ans += "<br>";
        }
        return ans;
    }
    @GetMapping("/gretting")
    public String greeting() {
        return "Welcome to the Spring API!";
    }
}

package com.example.webdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Example {

    @RequestMapping("/sushil")
    public String doSomething() {
        HashMap<String, String> h = new HashMap<>();
        h.put("name", "Jarvis");
        h.put("fatherName", "Sushil");

        return h.toString();
    }
}

package vn.its.springjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

//    http://localhost:8080/users
    @GetMapping("/users")
    public String users() {
        return "{\"users\":[{\"firstname\":\"Nguyen\", \"lastname\":\"Tuan\"}," + "{\"firstname\":\"Nguyen\",\"lastname\":\"Long\"}]}";
    }
}
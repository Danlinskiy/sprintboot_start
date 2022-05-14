package com.shan.controller;

import com.shan.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {
    @Value("${shan.name}")
    public String cat;

    @Value("${person[0].name}")
    public String firstPerson;

    @Autowired
    public Environment env;
//    @RequestMapping(value = "/user", method = RequestMethod.POST)
//    @PostMapping("/user")
    @PostMapping
    public String save() {
        return "User saved ...";
    }

//    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    @GetMapping("/user")
    @GetMapping("/{id}")
    public String get(@PathVariable int id) {
        return "User got" + id + " " + cat + " " + firstPerson + " " + env.getProperty("person[0].age");
    }

//    @RequestMapping(value = "/user", method = RequestMethod.PUT)
//    @PutMapping("/user")
    @PutMapping
    public String update(User user) {
        return "User updated ..." + user.toString();
    }

//    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
//    @DeleteMapping("/user")
    @DeleteMapping
    public String delete() {
        return "User deleted ...";
    }

    @GetMapping
    public String get(@RequestParam int id, String name) {
        return id + name;
    }
}

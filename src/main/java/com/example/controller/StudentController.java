package com.example.controller;

import com.example.response.StudentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

//    @Value("${app.name}")
    @Value("${app.name: default Springboot Demo2}")
    private String appName;

//    @GetMapping("/get")
//    public String getStudent() {
//        return appName;
//    }

    @GetMapping("/get")
    public StudentResponse getStudent() {
        StudentResponse sr = new StudentResponse((long)1, "firstName", "lastName");
        return sr;

    }
}

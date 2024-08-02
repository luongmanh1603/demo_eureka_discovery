package com.example.demo_student_service.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private HttpServletRequest request;
    @GetMapping("/student")
    public String student() {
        int serverPort = request.getServerPort();
        return "I'm student. Server port: " + serverPort;
    }
}

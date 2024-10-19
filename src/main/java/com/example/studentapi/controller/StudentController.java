package com.example.studentapi.controller;

import com.example.studentapi.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    // API to return student name and roll number
    @GetMapping("/student")
    public Student getStudent(@RequestParam(value = "name", defaultValue = "Jayaprakash A V") String name,
                              @RequestParam(value = "rollNumber", defaultValue = "2022MCS320009") String rollNumber) {
        return new Student(name, rollNumber);
    }
}

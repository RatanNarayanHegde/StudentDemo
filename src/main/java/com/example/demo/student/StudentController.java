package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(1L, "ratan", "ratanhegde08@gmail.com", Gender.MALE),
                new Student(2L, "rohit", "rohit@gmail.com", Gender.FEMALE)
        );
        return students;
    }
}

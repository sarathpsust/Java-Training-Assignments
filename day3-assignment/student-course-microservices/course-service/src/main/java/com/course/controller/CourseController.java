package com.course.controller;

import com.course.dto.CourseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping("/{id}")
    public CourseDto getCourseById(@PathVariable Long id) {

        return new CourseDto(
                501,
                "Java Microservices",
                "Amit Sharma"
        );
    }
}

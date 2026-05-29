package com.student.service;

import com.student.dto.CourseDto;
import com.student.dto.StudentDto;
import com.student.dto.StudentResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

    private final RestTemplate restTemplate;

    public StudentService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public StudentResponseDto getStudent(Long studentId) {

        StudentDto student = new StudentDto(
                1,
                "Neha",
                501
        );

        String url = "http://localhost:8081/courses/" + student.getCourseId();
        CourseDto course = restTemplate.getForObject(
                        url,
                        CourseDto.class
                );

        var response = new StudentResponseDto();
        response.setStudentId(student.getStudentId());
        response.setStudentName(student.getStudentName());
        response.setCourseName(course.getCourseName());
        response.setTrainer(course.getTrainer());

        return response;
    }
}

package com.student.dto;

import lombok.Data;

@Data
public class StudentResponseDto {

    private Integer studentId;
    private String studentName;
    private String courseName;
    private String trainer;
}

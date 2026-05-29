package com.department.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgumentsConstructor
@NoArgumentsConstructor
public class DepartmentDto {

    private Integer departmentId;
    private String departmentName;
    private String location;
    private String managerName;
}

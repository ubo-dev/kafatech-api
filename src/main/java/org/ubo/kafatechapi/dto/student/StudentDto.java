package org.ubo.kafatechapi.dto.student;

import org.springframework.stereotype.Component;
import org.ubo.kafatechapi.dto.department.DepartmentDto;

import java.util.UUID;

public record StudentDto(UUID studentId, String firstName, String lastName, DepartmentDto department) {
    public StudentDto {
    }
}

package org.ubo.kafatechapi.dto.instructor;

import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.model.Lecture;

import java.util.Set;
import java.util.UUID;

public record InstructorDto(UUID instructorId, String firstName, String lastName, DepartmentDto department) {
    public InstructorDto{

    }
}
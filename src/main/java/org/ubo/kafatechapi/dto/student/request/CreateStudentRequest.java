package org.ubo.kafatechapi.dto.student.request;

import org.ubo.kafatechapi.dto.department.DepartmentDto;

public record CreateStudentRequest(String firstName, String lastName, DepartmentDto department) {
}

package org.ubo.kafatechapi.dto.instructor.request;

import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.dto.student.StudentDto;
import org.ubo.kafatechapi.model.LetterGrade;

public record CreateInstructorRequest(String firstName, String lastName, DepartmentDto department) {
}

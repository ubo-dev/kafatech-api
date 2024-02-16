package org.ubo.kafatechapi.dto.department;

import org.ubo.kafatechapi.dto.instructor.InstructorDto;
import org.ubo.kafatechapi.dto.lecture.LectureDto;
import org.ubo.kafatechapi.dto.student.StudentDto;
import org.ubo.kafatechapi.model.Instructor;
import org.ubo.kafatechapi.model.Lecture;
import org.ubo.kafatechapi.model.Student;

import java.util.Set;

public record DepartmentDto(Integer id, String departmentName) {
    public DepartmentDto {
    }
}

package org.ubo.kafatechapi.dto.lecture;

import jakarta.persistence.*;
import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.dto.instructor.InstructorDto;
import org.ubo.kafatechapi.model.Department;
import org.ubo.kafatechapi.model.Instructor;
import org.ubo.kafatechapi.model.Lecture;
import org.ubo.kafatechapi.model.Student;

import java.util.Set;
import java.util.UUID;

public record LectureDto(UUID lectureId, String lectureCode, String lectureName, InstructorDto instructor, Set<Student> students, DepartmentDto department) {
}

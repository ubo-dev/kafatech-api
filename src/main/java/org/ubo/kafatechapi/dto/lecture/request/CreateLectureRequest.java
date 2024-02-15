package org.ubo.kafatechapi.dto.lecture.request;

import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.dto.instructor.InstructorDto;
import org.ubo.kafatechapi.model.Student;

import java.util.Set;
import java.util.UUID;

public record CreateLectureRequest(UUID lectureId, String lectureCode, String lectureName, InstructorDto instructorDto, DepartmentDto department) {
}

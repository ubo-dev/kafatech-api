package org.ubo.kafatechapi.dto.department;

import org.ubo.kafatechapi.model.Instructor;
import org.ubo.kafatechapi.model.Lecture;
import org.ubo.kafatechapi.model.Student;

import java.util.Set;

public record DepartmentDto(Integer id, String departmentName, Set<Student> students, Set<Instructor> instructors, Set<Lecture> lectures) {
}

package org.ubo.kafatechapi.dto.converter;

import org.springframework.stereotype.Component;
import org.ubo.kafatechapi.dto.student.StudentDto;
import org.ubo.kafatechapi.model.Student;

import java.util.List;

@Component
public class StudentDtoConverter {

    private final DepartmentDtoConverter departmentDtoConverter;

    public StudentDtoConverter(DepartmentDtoConverter departmentDtoConverter) {
        this.departmentDtoConverter = departmentDtoConverter;
    }

    public StudentDto convertStudentDto(Student student) {
        return new StudentDto(
            student.getStudentId(),
                student.getFirstName(),
                student.getLastName(),
                departmentDtoConverter.convertDepartmentDto(student.getDepartment())
        );
    }

    public List<StudentDto> convertStudentDtoList(List<Student> studentList) {
        return studentList.stream().map(this::convertStudentDto).toList();
    }
}

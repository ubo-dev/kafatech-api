package org.ubo.kafatechapi.service.student;

import org.ubo.kafatechapi.dto.student.StudentDto;
import org.ubo.kafatechapi.dto.student.request.CreateStudentRequest;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    StudentDto create(CreateStudentRequest request);

    List<StudentDto> getAll();

    StudentDto findById(UUID uuid);
}

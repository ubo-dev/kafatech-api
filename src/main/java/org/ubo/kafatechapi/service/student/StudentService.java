package org.ubo.kafatechapi.service.student;

import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.student.StudentDto;
import org.ubo.kafatechapi.dto.student.request.CreateStudentRequest;
import org.ubo.kafatechapi.model.Student;

import java.util.List;
import java.util.UUID;

@Service
public interface StudentService {

    StudentDto create(CreateStudentRequest request);

    List<StudentDto> getAll();

    StudentDto findById(UUID uuid);
}

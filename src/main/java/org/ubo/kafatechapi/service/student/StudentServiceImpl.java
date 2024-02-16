package org.ubo.kafatechapi.service.student;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.converter.DepartmentDtoConverter;
import org.ubo.kafatechapi.dto.converter.GradeDtoConverter;
import org.ubo.kafatechapi.dto.converter.StudentDtoConverter;
import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.dto.student.StudentDto;
import org.ubo.kafatechapi.dto.student.request.CreateStudentRequest;
import org.ubo.kafatechapi.model.Department;
import org.ubo.kafatechapi.model.Student;
import org.ubo.kafatechapi.repository.StudentRepository;
import org.ubo.kafatechapi.service.department.DepartmentService;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final DepartmentService departmentService;
    private final StudentDtoConverter studentDtoConverter;
    private final DepartmentDtoConverter departmentDtoConverter;
    private final GradeDtoConverter gradeDtoConverter;

    public StudentServiceImpl(StudentRepository studentRepository, DepartmentService departmentService,
                              StudentDtoConverter studentDtoConverter, DepartmentDtoConverter departmentDtoConverter,
                              GradeDtoConverter gradeDtoConverter) {
        this.studentRepository = studentRepository;
        this.departmentService = departmentService;
        this.studentDtoConverter = studentDtoConverter;
        this.departmentDtoConverter = departmentDtoConverter;
        this.gradeDtoConverter = gradeDtoConverter;
    }

    public StudentDto create(CreateStudentRequest request) {
        DepartmentDto department = departmentService.findById(
                request.department().id()
        );

        Student student = new Student(
                request.firstName(),
                request.lastName(),
                new Department(
                        department.id(),
                        department.departmentName()
                )
        );

        return studentDtoConverter.convertStudentDto(studentRepository.save(student));
    }

    public List<StudentDto> getAll() {
        var students = studentRepository.findAll();

        if (students.isEmpty())
            throw new EntityNotFoundException("There is no student to show.");

        return studentDtoConverter.convertStudentDtoList(students);
    }


    public StudentDto findById(UUID uuid) {
        var student = studentRepository.findById(uuid).orElseThrow(
                () -> new EntityNotFoundException("There is no student found with given id")
        );

        return studentDtoConverter.convertStudentDto(student);
    }
}

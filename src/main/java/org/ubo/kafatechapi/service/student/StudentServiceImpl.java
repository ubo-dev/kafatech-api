package org.ubo.kafatechapi.service.student;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.dto.student.StudentDto;
import org.ubo.kafatechapi.dto.student.request.CreateStudentRequest;
import org.ubo.kafatechapi.mapper.GenericMapper;
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

    private final GenericMapper<Student, StudentDto> studentMapper = new GenericMapper<>();
    private final GenericMapper<Department, DepartmentDto> departmentMapper = new GenericMapper<>();

    public StudentServiceImpl(StudentRepository studentRepository, DepartmentService departmentService) {
        this.studentRepository = studentRepository;
        this.departmentService = departmentService;
    }

    public StudentDto create(CreateStudentRequest request) {
        Department department = departmentMapper.convertToEntity(departmentService.findById(
                request.department().getId()
        ), Department.class);

        Student student = new Student(
                request.firstName(),
                request.lastName(),
                department
        );

        return studentMapper.convertToDto(studentRepository.save(student), StudentDto.class);
    }

    public List<StudentDto> getAll() {
        var students = studentRepository.findAll();

        if (students.isEmpty())
            throw new EntityNotFoundException("There is no student to show.");

        return studentMapper.mapListToDto(students, StudentDto.class);
    }


    public StudentDto findById(UUID uuid) {
        var student = studentRepository.findById(uuid).orElseThrow(
                () -> new EntityNotFoundException("There is no student found with given id")
        );

        return studentMapper.convertToDto(student, StudentDto.class);
    }
}

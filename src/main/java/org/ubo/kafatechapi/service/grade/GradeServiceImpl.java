package org.ubo.kafatechapi.service.grade;

import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.grade.GradeDto;
import org.ubo.kafatechapi.dto.grade.request.CreateGradeRequest;
import org.ubo.kafatechapi.dto.student.StudentDto;
import org.ubo.kafatechapi.mapper.GenericMapper;
import org.ubo.kafatechapi.model.Grade;
import org.ubo.kafatechapi.model.Student;
import org.ubo.kafatechapi.repository.GradeRepository;
import org.ubo.kafatechapi.service.student.StudentService;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    private final GradeRepository gradeRepository;
    private final StudentService studentService;

    private final GenericMapper<Student, StudentDto> studentMapper = new GenericMapper<>();
    private final GenericMapper<Grade, GradeDto> gradeMapper = new GenericMapper<>();
    public GradeServiceImpl(GradeRepository gradeRepository, StudentService studentService) {
        this.gradeRepository = gradeRepository;
        this.studentService = studentService;
    }
    public GradeDto create(CreateGradeRequest request) {
        Student student = studentMapper.convertToEntity(
                studentService.findById(request.student().getStudentId()
        ), Student.class);

        Grade grade = new Grade(
                request.gradePoint(),
                request.letterGrade(),
                student
        );

        return gradeMapper.convertToDto(gradeRepository.save(grade), GradeDto.class);
    }

    public List<GradeDto> getAll() {
        return null;
    }
}

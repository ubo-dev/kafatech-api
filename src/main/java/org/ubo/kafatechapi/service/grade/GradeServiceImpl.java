package org.ubo.kafatechapi.service.grade;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.converter.GradeDtoConverter;
import org.ubo.kafatechapi.dto.converter.StudentDtoConverter;
import org.ubo.kafatechapi.dto.grade.GradeDto;
import org.ubo.kafatechapi.dto.grade.request.CreateGradeRequest;
import org.ubo.kafatechapi.model.Grade;
import org.ubo.kafatechapi.model.Lecture;
import org.ubo.kafatechapi.model.Student;
import org.ubo.kafatechapi.repository.GradeRepository;
import org.ubo.kafatechapi.repository.LectureRepository;
import org.ubo.kafatechapi.repository.StudentRepository;
import org.ubo.kafatechapi.service.department.DepartmentService;
import org.ubo.kafatechapi.service.student.StudentService;

import java.util.List;
import java.util.UUID;

@Service
public class GradeServiceImpl implements GradeService {

    private final GradeRepository gradeRepository;
    private final StudentService studentService;
    private final StudentRepository studentRepository;
    private final LectureRepository lectureRepository;
    private final DepartmentService departmentService;
    private final StudentDtoConverter studentDtoConverter;
    private final GradeDtoConverter gradeDtoConverter;
    public GradeServiceImpl(GradeRepository gradeRepository, StudentService studentService, DepartmentService departmentService,
                            StudentDtoConverter studentDtoConverter, GradeDtoConverter gradeDtoConverter,
                            StudentRepository studentRepository, LectureRepository lectureRepository) {
        this.gradeRepository = gradeRepository;
        this.studentService = studentService;
        this.departmentService = departmentService;
        this.studentDtoConverter = studentDtoConverter;
        this.gradeDtoConverter = gradeDtoConverter;
        this.studentRepository = studentRepository;
        this.lectureRepository = lectureRepository;
    }
    public GradeDto create(CreateGradeRequest request) {
        Student student = studentRepository.findById(
                request.student().studentId()).orElseThrow(
                        () -> new EntityNotFoundException("There is no student with given id.")
                );

        Lecture lecture = lectureRepository.findById(
                request.lecture().lectureId()).orElseThrow(
                () -> new EntityNotFoundException("There is no lecture with given id.")
            );


        Grade grade = new Grade(
                request.gradePoint(),
                request.letterGrade(),
                student,
                lecture
        );

        return gradeDtoConverter.convertGradeDto(gradeRepository.save(grade));
    }

    public List<GradeDto> getAll() {
        var grades = gradeRepository.findAll();

        if (grades.isEmpty())
            throw new EntityNotFoundException("There is no grade to show.");

        return gradeDtoConverter.convertGradeDtoList(grades);
    }

    @Override
    public GradeDto findById(UUID gradeId) {
        Grade grade = gradeRepository.findById(gradeId)
                .orElseThrow(
                        () -> new EntityNotFoundException("There is no grade found with given id.")
                );

        return gradeDtoConverter.convertGradeDto(grade);
    }

    public void deleteById(UUID gradeId) {
        gradeRepository.deleteById(gradeId);
    }
}

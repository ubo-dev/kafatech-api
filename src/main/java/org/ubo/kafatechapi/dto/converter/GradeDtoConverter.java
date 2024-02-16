package org.ubo.kafatechapi.dto.converter;

import org.springframework.stereotype.Component;
import org.ubo.kafatechapi.dto.grade.GradeDto;
import org.ubo.kafatechapi.model.Grade;


import java.util.List;

@Component
public class GradeDtoConverter {

    private final StudentDtoConverter studentDtoConverter;
    private final LectureDtoConverter lectureDtoConverter;

    public GradeDtoConverter(StudentDtoConverter studentDtoConverter, LectureDtoConverter lectureDtoConverter) {
        this.studentDtoConverter = studentDtoConverter;
        this.lectureDtoConverter = lectureDtoConverter;
    }

    public GradeDto convertGradeDto(Grade grade) {
        return new GradeDto(
                grade.getGradeId(),
                grade.getGradePoint(),
                grade.getLetterGrade(),
                studentDtoConverter.convertStudentDto(grade.getStudent()),
                lectureDtoConverter.convertLectureDto(grade.getLecture())
        );
    }

    public List<GradeDto> convertGradeDtoList(List<Grade> gradeList) {
        return gradeList.stream().map(this::convertGradeDto).toList();
    }
}

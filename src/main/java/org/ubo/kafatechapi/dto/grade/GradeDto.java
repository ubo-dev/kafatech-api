package org.ubo.kafatechapi.dto.grade;

import org.ubo.kafatechapi.dto.lecture.LectureDto;
import org.ubo.kafatechapi.dto.student.StudentDto;

import org.ubo.kafatechapi.model.LetterGrade;

import java.util.UUID;

public record GradeDto(UUID gradeId, float gradePoint, LetterGrade letterGrade, StudentDto student, LectureDto lecture) {
    public GradeDto {
    }
}
package org.ubo.kafatechapi.dto.grade.request;

import org.ubo.kafatechapi.dto.student.StudentDto;
import org.ubo.kafatechapi.model.LetterGrade;

import java.util.UUID;

public record CreateGradeRequest(float gradePoint, LetterGrade letterGrade, StudentDto student) {
}

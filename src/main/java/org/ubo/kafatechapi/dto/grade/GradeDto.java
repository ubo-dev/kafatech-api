package org.ubo.kafatechapi.dto.grade;

import jakarta.persistence.*;
import org.ubo.kafatechapi.dto.student.StudentDto;
import org.ubo.kafatechapi.model.Instructor;
import org.ubo.kafatechapi.model.Lecture;
import org.ubo.kafatechapi.model.LetterGrade;
import org.ubo.kafatechapi.model.Student;

import java.util.Set;
import java.util.UUID;

public record GradeDto(UUID gradeId, float gradePoint, LetterGrade letterGrade, StudentDto student) {
}
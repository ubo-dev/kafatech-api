package org.ubo.kafatechapi.dto.grade;

import org.ubo.kafatechapi.dto.student.StudentDto;

import org.ubo.kafatechapi.model.LetterGrade;

import java.util.UUID;

public class GradeDto {
    private UUID gradeId;
    private float gradePoint;
    private LetterGrade letterGrade;
    private StudentDto student;

    public GradeDto(UUID gradeId, float gradePoint, LetterGrade letterGrade, StudentDto student) {
        this.gradeId = gradeId;
        this.gradePoint = gradePoint;
        this.letterGrade = letterGrade;
        this.student = student;
    }

    public UUID getGradeId() {
        return gradeId;
    }

    public void setGradeId(UUID gradeId) {
        this.gradeId = gradeId;
    }

    public float getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(float gradePoint) {
        this.gradePoint = gradePoint;
    }

    public LetterGrade getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(LetterGrade letterGrade) {
        this.letterGrade = letterGrade;
    }

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }
}
package org.ubo.kafatechapi.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID gradeId;

    private float gradePoint;

    @Enumerated(EnumType.STRING)
    private LetterGrade letterGrade;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;


    public Grade(UUID gradeId, float gradePoint, LetterGrade letterGrade, Student student) {
        this.gradeId = gradeId;
        this.gradePoint = gradePoint;
        this.letterGrade = letterGrade;
        this.student = student;
    }

    public Grade(float gradePoint, LetterGrade letterGrade, Student student, Lecture lecture) {
        this.gradePoint = gradePoint;
        this.letterGrade = letterGrade;
        this.student = student;
        this.lecture = lecture;
    }

    public Grade() {

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lecture getLecture() {
        return lecture;
    }
}

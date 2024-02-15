package org.ubo.kafatechapi.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID lectureId;

    private String lectureCode;

    private String lectureName;

    @ManyToOne
    Instructor instructor;
    @ManyToMany
    @JoinTable(
            name = "student_lecture",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "lecture_id")
    )
    Set<Student> students;

    @ManyToOne
    Department department;

    public Lecture(UUID lectureId, String lectureCode, String lectureName, Instructor instructor, Department department) {
        this.lectureId = lectureId;
        this.lectureCode = lectureCode;
        this.lectureName = lectureName;
        this.instructor = instructor;
        this.department = department;
    }

    public Lecture() {

    }

    public UUID getLectureId() {
        return lectureId;
    }

    public void setLectureId(UUID lectureId) {
        this.lectureId = lectureId;
    }

    public String getLectureCode() {
        return lectureCode;
    }

    public void setLectureCode(String lectureCode) {
        this.lectureCode = lectureCode;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}

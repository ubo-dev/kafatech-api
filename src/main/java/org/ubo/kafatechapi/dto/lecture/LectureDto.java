package org.ubo.kafatechapi.dto.lecture;

import jakarta.persistence.*;
import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.dto.instructor.InstructorDto;
import org.ubo.kafatechapi.model.Department;
import org.ubo.kafatechapi.model.Instructor;
import org.ubo.kafatechapi.model.Lecture;
import org.ubo.kafatechapi.model.Student;

import java.util.Set;
import java.util.UUID;

public class LectureDto {

    private UUID lectureId;
    private String lectureCode;
    private  String lectureName;
    private InstructorDto instructor;
    private Set<Student> students;
    private DepartmentDto department;

    public LectureDto(UUID lectureId, String lectureCode, String lectureName, InstructorDto instructor, Set<Student> students, DepartmentDto department) {
        this.lectureId = lectureId;
        this.lectureCode = lectureCode;
        this.lectureName = lectureName;
        this.instructor = instructor;
        this.students = students;
        this.department = department;
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

    public InstructorDto getInstructor() {
        return instructor;
    }

    public void setInstructor(InstructorDto instructor) {
        this.instructor = instructor;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }
}

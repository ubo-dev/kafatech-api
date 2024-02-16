package org.ubo.kafatechapi.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;
    private String departmentName;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private Set<Student> students;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private Set<Lecture> lectures;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private Set<Instructor> instructors;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(Integer departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Department(Integer departmentId, String departmentName, Set<Student> students, Set<Lecture> lectures, Set<Instructor> instructors) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.students = students;
        this.lectures = lectures;
        this.instructors = instructors;
    }

    public Department() {

    }


    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }

    public Set<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(Set<Instructor> instructors) {
        this.instructors = instructors;
    }
}

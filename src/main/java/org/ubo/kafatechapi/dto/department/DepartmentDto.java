package org.ubo.kafatechapi.dto.department;

import org.ubo.kafatechapi.model.Instructor;
import org.ubo.kafatechapi.model.Lecture;
import org.ubo.kafatechapi.model.Student;

import java.util.Set;

public class DepartmentDto {
    private Integer id;
    private String departmentName;
    private Set<Student> students;
    private Set<Instructor> instructors;
    private Set<Lecture> lectures;

    public DepartmentDto(Integer id, String departmentName, Set<Student> students, Set<Instructor> instructors, Set<Lecture> lectures) {
        this.id = id;
        this.departmentName = departmentName;
        this.students = students;
        this.instructors = instructors;
        this.lectures = lectures;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Set<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(Set<Instructor> instructors) {
        this.instructors = instructors;
    }

    public Set<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }
}

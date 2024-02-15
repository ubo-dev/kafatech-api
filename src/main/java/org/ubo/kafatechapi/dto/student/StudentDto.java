package org.ubo.kafatechapi.dto.student;

import org.ubo.kafatechapi.dto.department.DepartmentDto;

import java.util.UUID;


public class StudentDto {
    private UUID studentId;
    private String firstName;
    private String lastName;
    private DepartmentDto department;

    public StudentDto(UUID studentId, String firstName, String lastName, DepartmentDto department) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public StudentDto() {

    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }
}

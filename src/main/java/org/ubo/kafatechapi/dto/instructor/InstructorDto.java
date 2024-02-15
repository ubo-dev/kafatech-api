package org.ubo.kafatechapi.dto.instructor;

import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.model.Lecture;

import java.util.Set;
import java.util.UUID;

public class InstructorDto {

    private UUID instructorId;
    private String firstName;
    private String lastName;
    private Set<Lecture> lectures;
    private DepartmentDto department;

    public InstructorDto(UUID instructorId, String firstName, String lastName, Set<Lecture> lectures, DepartmentDto department) {
        this.instructorId = instructorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lectures = lectures;
        this.department = department;
    }

    public UUID getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(UUID instructorId) {
        this.instructorId = instructorId;
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

    public Set<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }
}

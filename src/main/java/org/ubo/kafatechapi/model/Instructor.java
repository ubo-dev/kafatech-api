package org.ubo.kafatechapi.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID instructorId;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "instructor", fetch = FetchType.EAGER)
    private Set<Lecture> lectures;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;

    public Instructor(UUID instructorId, String firstName, String lastName, Set<Lecture> lectures, Department department) {
        this.instructorId = instructorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lectures = lectures;
        this.department = department;
    }

    public Instructor() {

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

    public UUID getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(UUID instructorId) {
        this.instructorId = instructorId;
    }

    public Set<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

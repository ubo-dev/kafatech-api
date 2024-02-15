package org.ubo.kafatechapi.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID instructorId;

    @OneToMany(mappedBy = "instructor", fetch = FetchType.EAGER)
    private Set<Lecture> lectures;

    @ManyToOne
    private Department department;

    public Instructor(UUID instructorId, Set<Lecture> lectures, Department department) {
        this.instructorId = instructorId;
        this.lectures = lectures;
        this.department = department;
    }

    public Instructor() {

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

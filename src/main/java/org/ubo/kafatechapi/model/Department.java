package org.ubo.kafatechapi.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;
    private String departmentName;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private Set<Student> students;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private Set<Lecture> lectures;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private Set<Instructor> instructors;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Department() {

    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

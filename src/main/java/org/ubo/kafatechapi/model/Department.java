package org.ubo.kafatechapi.model;

import jakarta.persistence.*;

import java.util.Set;

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

    public Department() {

    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

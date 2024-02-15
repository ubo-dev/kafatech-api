package org.ubo.kafatechapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ubo.kafatechapi.model.Student;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}

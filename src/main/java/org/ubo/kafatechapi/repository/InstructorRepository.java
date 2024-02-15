package org.ubo.kafatechapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ubo.kafatechapi.model.Instructor;

import java.util.UUID;

public interface InstructorRepository extends JpaRepository<Instructor, UUID> {
}

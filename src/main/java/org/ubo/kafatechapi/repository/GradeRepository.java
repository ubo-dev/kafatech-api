package org.ubo.kafatechapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ubo.kafatechapi.model.Grade;

import java.util.UUID;

public interface GradeRepository extends JpaRepository<Grade, UUID> {
}

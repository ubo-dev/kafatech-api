package org.ubo.kafatechapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ubo.kafatechapi.model.Department;
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}

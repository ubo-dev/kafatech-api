package org.ubo.kafatechapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ubo.kafatechapi.model.Lecture;

import java.util.Optional;
import java.util.UUID;

public interface LectureRepository extends JpaRepository<Lecture, UUID> {

    Optional<Lecture> findLectureByLectureCode(String lectureCode);
}

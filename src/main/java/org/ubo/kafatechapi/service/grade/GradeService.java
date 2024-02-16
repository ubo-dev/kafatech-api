package org.ubo.kafatechapi.service.grade;

import org.ubo.kafatechapi.dto.grade.GradeDto;
import org.ubo.kafatechapi.dto.grade.request.CreateGradeRequest;
import org.ubo.kafatechapi.dto.lecture.LectureDto;

import java.util.List;
import java.util.UUID;

public interface GradeService {

    GradeDto create(CreateGradeRequest request);

    List<GradeDto> getAll();

    GradeDto findById(UUID gradeId);

    void deleteById(UUID gradeId);
}

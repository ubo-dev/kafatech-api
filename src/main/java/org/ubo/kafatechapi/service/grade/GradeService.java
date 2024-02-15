package org.ubo.kafatechapi.service.grade;

import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.dto.department.request.CreateDepartmentRequest;
import org.ubo.kafatechapi.dto.grade.GradeDto;
import org.ubo.kafatechapi.dto.grade.request.CreateGradeRequest;

import java.util.List;

public interface GradeService {

    GradeDto create(CreateGradeRequest request);

    List<GradeDto> getAll();
}

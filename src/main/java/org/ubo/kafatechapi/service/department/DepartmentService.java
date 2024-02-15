package org.ubo.kafatechapi.service.department;

import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.dto.department.request.CreateDepartmentRequest;

import java.util.List;

@Service
public interface DepartmentService {

    DepartmentDto create(CreateDepartmentRequest request);

    List<DepartmentDto> getAllDepartment();

}

package org.ubo.kafatechapi.dto.converter;

import org.springframework.stereotype.Component;
import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.model.Department;

import java.util.List;

@Component
public class DepartmentDtoConverter {


    public DepartmentDto convertDepartmentDto(Department department) {
        return new DepartmentDto(
                department.getDepartmentId(),
                department.getDepartmentName()
        );
    }

    public List<DepartmentDto> convertDepartmentDtoList(List<Department> departments) {
        return departments.stream().map(this::convertDepartmentDto).toList();
    }
}

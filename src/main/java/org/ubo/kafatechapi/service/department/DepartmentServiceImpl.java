package org.ubo.kafatechapi.service.department;

import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.dto.department.request.CreateDepartmentRequest;
import org.ubo.kafatechapi.mapper.GenericMapper;
import org.ubo.kafatechapi.model.Department;
import org.ubo.kafatechapi.repository.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final GenericMapper<Department, DepartmentDto> departmentMapper = new GenericMapper<>();

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public DepartmentDto create(CreateDepartmentRequest request) {
        Department department = new Department(
                request.departmentName()
        );

        return departmentMapper.convertToDto(departmentRepository.save(department), DepartmentDto.class);
    }

    public List<DepartmentDto> getAllDepartment() {
        var departments = departmentRepository.findAll();

        if (!departments.isEmpty())
            throw new RuntimeException("There is no department to show.");

        return departmentMapper.mapListToDto(departments, DepartmentDto.class);
    }
}
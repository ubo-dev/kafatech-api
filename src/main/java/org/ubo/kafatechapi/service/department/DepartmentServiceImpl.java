package org.ubo.kafatechapi.service.department;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.converter.DepartmentDtoConverter;
import org.ubo.kafatechapi.dto.department.DepartmentDto;
import org.ubo.kafatechapi.dto.department.request.CreateDepartmentRequest;
import org.ubo.kafatechapi.model.Department;
import org.ubo.kafatechapi.repository.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentDtoConverter departmentDtoConverter;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, DepartmentDtoConverter departmentDtoConverter) {
        this.departmentRepository = departmentRepository;
        this.departmentDtoConverter = departmentDtoConverter;
    }

    public DepartmentDto create(CreateDepartmentRequest request) {
        Department department = new Department(
                request.departmentName()
        );

        return departmentDtoConverter.convertDepartmentDto(departmentRepository.save(department));
    }

    public List<DepartmentDto> getAllDepartment() {
        var departments = departmentRepository.findAll();

        if (departments.isEmpty())
            throw new EntityNotFoundException("There is no department to show.");

        return departmentDtoConverter.convertDepartmentDtoList(departments);
    }

    public DepartmentDto findById(Integer id) {
        var department = departmentRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("There is no department found with given id: " + id)
        );

        return departmentDtoConverter.convertDepartmentDto(department);
    }
}

package org.ubo.kafatechapi.dto.converter;

import org.springframework.stereotype.Component;
import org.ubo.kafatechapi.dto.instructor.InstructorDto;
import org.ubo.kafatechapi.model.Instructor;

import java.util.List;

@Component
public class InstructorDtoConverter {

    private final DepartmentDtoConverter departmentDtoConverter;

    public InstructorDtoConverter(DepartmentDtoConverter departmentDtoConverter) {
        this.departmentDtoConverter = departmentDtoConverter;
    }

    public InstructorDto convertInstructorDto(Instructor instructor) {
        return new InstructorDto(
                instructor.getInstructorId(),
                instructor.getFirstName(),
                instructor.getLastName(),
                departmentDtoConverter.convertDepartmentDto(instructor.getDepartment())
        );
    }

    public List<InstructorDto> convertInstructorDtoList(List<Instructor> instructors) {
        return instructors.stream().map(this::convertInstructorDto).toList();
    }
}

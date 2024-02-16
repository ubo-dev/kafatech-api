package org.ubo.kafatechapi.service.instructor;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.converter.InstructorDtoConverter;
import org.ubo.kafatechapi.dto.instructor.InstructorDto;
import org.ubo.kafatechapi.model.Instructor;
import org.ubo.kafatechapi.repository.InstructorRepository;

import java.util.List;
import java.util.UUID;

@Service
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;
    private final InstructorDtoConverter instructorDtoConverter;

    public InstructorServiceImpl(InstructorRepository instructorRepository, InstructorDtoConverter instructorDtoConverter) {
        this.instructorDtoConverter = instructorDtoConverter;
        this.instructorRepository = instructorRepository;
    }

    public InstructorDto findById(UUID instructorId) {
        Instructor instructor = instructorRepository.findById(instructorId)
                .orElseThrow(
                        () -> new EntityNotFoundException("There is no instructor found with given id.")
                );

        return instructorDtoConverter.convertInstructorDto(instructor);
    }

    public List<InstructorDto> getAllInstructor() {
        List<InstructorDto> instructorDtos = instructorDtoConverter.convertInstructorDtoList(
                instructorRepository.findAll()
        );

        if (instructorDtos.isEmpty())
            throw new EntityNotFoundException("There is no instructor found.");

        return instructorDtos;
    }
}

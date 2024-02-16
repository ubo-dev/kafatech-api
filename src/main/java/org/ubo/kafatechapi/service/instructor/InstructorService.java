package org.ubo.kafatechapi.service.instructor;

import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.instructor.InstructorDto;

import java.util.List;
import java.util.UUID;

@Service
public interface InstructorService {

    InstructorDto findById(UUID instructorId);

    List<InstructorDto> getAllInstructor();
}

package org.ubo.kafatechapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ubo.kafatechapi.dto.instructor.InstructorDto;
import org.ubo.kafatechapi.service.instructor.InstructorService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<InstructorDto>> getAll() {
        return ResponseEntity.ok(instructorService.getAllInstructor());
    }

    @GetMapping("/findInstructorById/{instructorId}")
    public ResponseEntity<InstructorDto> findById(@PathVariable UUID instructorId) {
        return ResponseEntity.ok(instructorService.findById(instructorId));
    }
}

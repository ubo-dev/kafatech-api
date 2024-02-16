package org.ubo.kafatechapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.ubo.kafatechapi.dto.grade.GradeDto;
import org.ubo.kafatechapi.dto.grade.request.CreateGradeRequest;
import org.ubo.kafatechapi.service.grade.GradeService;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/grades")
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<GradeDto>> getAllGrades() {
        return ResponseEntity.ok(gradeService.getAll());
    }

    @GetMapping("/findGradeById/{id}")
    public ResponseEntity<GradeDto> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(gradeService.findById(id));
    }
    @PostMapping("/createGrade")
    public ResponseEntity<GradeDto> createGrade(@RequestBody CreateGradeRequest request) {
        return ResponseEntity.ok(gradeService.create(request));
    }

    @DeleteMapping("/deleteGradeById/{gradeId}")
    public ResponseEntity<String> deleteGradeById(@PathVariable UUID gradeId) {
        gradeService.deleteById(gradeId);
        return ResponseEntity.ok("Grade successfully deleted.");
    }
}

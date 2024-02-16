package org.ubo.kafatechapi.dto.converter;

import org.springframework.stereotype.Component;
import org.ubo.kafatechapi.dto.lecture.LectureDto;
import org.ubo.kafatechapi.model.Lecture;

import java.util.List;

@Component
public class LectureDtoConverter {

    private final InstructorDtoConverter instructorDtoConverter;

    public LectureDtoConverter(InstructorDtoConverter instructorDtoConverter) {
        this.instructorDtoConverter = instructorDtoConverter;
    }

    public LectureDto convertLectureDto(Lecture lecture) {
        return new LectureDto(
                lecture.getLectureId(),
                lecture.getLectureCode(),
                lecture.getLectureName(),
                instructorDtoConverter.convertInstructorDto(lecture.getInstructor())
        );
    }

    public List<LectureDto> convertLectureDtoList(List<Lecture> lectures) {
        return lectures.stream().map(this::convertLectureDto).toList();
    }
}

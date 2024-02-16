package org.ubo.kafatechapi.service.lecture;

import org.springframework.stereotype.Service;
import org.ubo.kafatechapi.dto.lecture.LectureDto;

import java.util.List;
import java.util.UUID;

@Service
public interface LectureService {

    LectureDto findById(UUID lectureId);

    List<LectureDto> getAllLecture();

    LectureDto findLectureByLectureCode(String lectureCode);
}

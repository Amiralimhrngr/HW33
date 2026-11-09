package ir.maktabsharif.service;

import ir.maktabsharif.model.StudySession;

import java.util.List;

public interface StudySessionService {
    List<StudySession> findAll();

    StudySession findById(Long id);

    void add(StudySession studySession);
}

package ir.maktabsharif.service;

import ir.maktabsharif.model.StudySession;
import ir.maktabsharif.repository.StudySessionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudySessionServiceImpl implements StudySessionService{
    private final StudySessionRepository studySessionRepository;

    @Autowired
    public StudySessionServiceImpl(StudySessionRepository studySessionRepository) {
        this.studySessionRepository = studySessionRepository;
    }

    @Override
    public List<StudySession> findAll() {
        return studySessionRepository.findAll();
    }

    @Override
    public StudySession findById(Long id) {
        return studySessionRepository.findById(id);
    }

    @Override
    public void add(StudySession studySession) {
        studySessionRepository.add(studySession);
    }
}

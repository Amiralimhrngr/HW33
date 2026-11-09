package ir.maktabsharif.repository;

import ir.maktabsharif.model.StudySession;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudySessionRepositoryImpl implements StudySessionRepository{
    private static final List<StudySession> studySessions = new ArrayList<>();
    private static Long id = 5L;

    static {
        studySessions.add(new StudySession(1L, 1L, 60, "Review the new lessons"));
        studySessions.add(new StudySession(2L, 1L, 150, "Solve problems related to new lessons"));
        studySessions.add(new StudySession(3L, 2L, 120, "Search for animated version of new lesson online"));
        studySessions.add(new StudySession(4L, 3L, 10, "Figure out what CS is!?"));
    }

    @Override
    public List<StudySession> findAll() {
        return new ArrayList<>(studySessions);
    }

    @Override
    public StudySession findById(Long id) {
        return studySessions.stream()
                .filter(session -> session.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(StudySession session) {
        session.setId(id);
        id++;
        studySessions.add(session);
    }
}

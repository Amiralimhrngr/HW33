package ir.maktabsharif.repository;

import ir.maktabsharif.model.Subject;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class SubjectRepositoryImpl implements SubjectRepository{
    private static final List<Subject> subjects = new ArrayList<>();

    static {
        subjects.add(new Subject(1L, "Math"));
        subjects.add(new Subject(2L, "Physics"));
        subjects.add(new Subject(3L, "CS"));
    }

    @Override
    public List<Subject> findAll() {
        return new ArrayList<>(subjects);
    }

    @Override
    public Subject findById(Long id) {
        return subjects.stream()
                .filter(subject -> subject.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

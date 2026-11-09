package ir.maktabsharif.repository;

import ir.maktabsharif.model.Subject;

import java.util.List;

public interface SubjectRepository {
    List<Subject> findAll();
    Subject findById(Long id);
}

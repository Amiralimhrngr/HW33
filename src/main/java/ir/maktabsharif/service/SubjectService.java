package ir.maktabsharif.service;

import ir.maktabsharif.model.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> findAll();
    Subject findById(Long id);
}

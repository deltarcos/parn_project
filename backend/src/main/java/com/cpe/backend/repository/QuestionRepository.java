package com.cpe.backend.repository;

import com.cpe.backend.Entity.Question;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface QuestionRepository extends JpaRepository<Question, Long> {
    public List<Question> findByQ(String q);
    Question findById(long id);
}
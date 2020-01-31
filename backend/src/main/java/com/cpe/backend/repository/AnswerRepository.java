package com.cpe.backend.repository;

import com.cpe.backend.Entity.Answer;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface AnswerRepository extends JpaRepository<Answer, Long> {
    Answer findById(long id);
}
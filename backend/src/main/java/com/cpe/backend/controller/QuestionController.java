package com.cpe.backend.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.Collection;
//import java.util.Date;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.net.URLDecoder;


import com.cpe.backend.Entity.Question;


import com.cpe.backend.repository.QuestionRepository;



import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;



    QuestionController(QuestionRepository questionRepository) {
        this.questionRepository =questionRepository;
    }

    @RequestMapping(value = "question/question/{q}")
        public List<Question> getQuestionByQ(@PathVariable String q) {
            return questionRepository.findByQ(q);
        }

    @GetMapping("/question")
    public Collection<Question> Question() {
        return questionRepository.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/question/{id}")
    public  Optional <Question> Questions(@PathVariable Long id){
            Optional<Question> question = questionRepository.findById(id);
            return question;
    }

    

    @PostMapping("/drug/{q}")
    public Question newQuestion(Question newQuestion,
    @PathVariable String q )


    {
    newQuestion.setQuestion(q);
    //newQuestion.setAnswer(a);


    return questionRepository.save(newQuestion); 
    
    }
}
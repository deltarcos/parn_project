package com.cpe.backend;


import com.cpe.backend.Entity.Question;
import com.cpe.backend.repository.QuestionRepository;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BackendApplication {

	public static void main(final String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	ApplicationRunner init(
			final QuestionRepository questionRepository
			) {
		return args -> {

			Stream.of("ช่อง 1","ช่อง 2","ช่อง 3").forEach(q ->
			Stream.of("1","2","3").forEach(a -> {
				final Question question = new Question();
				question.setQuestion(q);
				question.setAnswer(a);
				questionRepository.save(question);
			});



			
			//medicineQuantityRepository.findAll().forEach(System.out::println);

		};
	}

}

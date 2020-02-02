package com.cpe.backend;


import com.cpe.backend.Entity.Question;
import com.cpe.backend.repository.QuestionRepository;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;



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
			
			Question q1 = new Question();
			q1.setQuestion("Line bot ใช้ยังไงคะ");
			q1.setAnswer("https://www.picz.in.th/image/RM2uTP");
			questionRepository.save(q1);


			

		};
		}
	}




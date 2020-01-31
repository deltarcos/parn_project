package com.cpe.backend;


import com.cpe.backend.Entity.Question;
import com.cpe.backend.repository.QuestionRepository;

import com.cpe.backend.Entity.Answer;
import com.cpe.backend.repository.AnswerRepository;


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
			final QuestionRepository questionRepository,
			final AnswerRepository answerRepository
			) {
		return args -> {
			//คำถาม
			Stream.of(
				//1
			"Line bot ใช้ยังไงคะ",
				//2
			"ลงทะเบียนไลน์บอทไม่ได้",
			"ช่อง 3").forEach(q ->{
				final Question question = new Question();
				question.setQuestion(q);
				questionRepository.save(question);
			});

			//คำตอบ
			Stream.of(
				///1
			"เพิ่มเพื่อน @libnu แล้วลงทะเบียนโดยใช้รหัส NU Account เมื่อได้รับโค้ดมาแล้วส่งโค้ดกลับมาในไลน์บอท รอจนระบบยืนยัน ชื่อ-นามสกุล และรหัสบาร์โค้ด จากนั้นสามารถใช้บริการยืมต่อออนไลน์, ตรวจสอบการยืมหนังสือ สืบค้นทรัพยากรและลงทะเบียนอบรมสารสนเทศได้เช่นกัน",
			"ต้องเป็นนิสิต บุคลากร มหาวิทยาลัยนเรศวรและสมาชิกห้องสมุดเท่านั้น ที่มี NU Account ในการลงทะเบียนค่ะ",
			"3").forEach(a ->{
				final Answer answer = new Answer();
			    answer.setAnswer(a);
				answerRepository.save(answer);
			});



			


		};
	}

}

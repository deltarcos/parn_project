package com.cpe.backend.Entity;
import lombok.*;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;


@Data
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "Question")
public class Question {

    @Id
    @SequenceGenerator(name="question_seq",sequenceName="question_seq", initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="question_seq")
    @Column(name = "QUESTION_ID", unique = true, nullable = true)
    private @NonNull Long id;

 
    private @NotNull String q;

    private @NotNull String a;






    public void setID(Long id){
        this.id = id;
    }

    public String getQuestion(){
        return q;
    }


    public void setAnswer(String a){
        this.a = a;
    }

    public String getAnswer(){
        return a;
    }


    public void setQuestion(String q){
        this.q = q;
    }

    

}




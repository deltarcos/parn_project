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
@Table(name = "Answer")
public class Answer {

    @Id
    @SequenceGenerator(name="answer_seq",sequenceName="answer_seq", initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="answer_seq")
    @Column(name = "ANSWER_ID", unique = true, nullable = true)
    private @NonNull Long id;

 

    private @NotNull String a;




    public void setID(Long id){
        this.id = id;
    }


    public String getAnswer(){
        return a;
    }

    public void setAnswer(String a){
        this.a = a;
    }

}




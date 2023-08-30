package com.hibernate.OneToMantyentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="question_table")
public class Question {
    @Id
    @Column(name = "question_id")
    private int id;
    private String question;
    @OneToOne
    private Answer answer;

}

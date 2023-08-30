package com.hibernate.OneToMantycontroller;

import com.hibernate.OneToMantyentity.Answer;
import com.hibernate.OneToMantyentity.Question;
import com.hibernate.OneToManyrepository.AnswerRepository;
import com.hibernate.OneToManyrepository.QuestionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Q_A_Controller {

    QuestionRepository questionRepository;
    AnswerRepository answerRepository;

    public Q_A_Controller(QuestionRepository questionRepository, AnswerRepository answerRepository) {
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
    }
    //http://localhost:8080/api/question
    @RequestMapping("/api/question")
    public void test(){


        Question q1=new Question();
        q1.setId(1212);
        q1.setQuestion("what is java ? ");
        Answer a1=new Answer();
        a1.setAid(1455);
        a1.setAns("java is a programming language");
        q1.setAnswer(a1);





        Question q2=new Question();
        q2.setId(1215);
        q2.setQuestion("what is HTML ? ");
        Answer a2=new Answer();
        a2.setAid(1466);
        a2.setAns("HTML is a Markap language");
        q2.setAnswer(a2);





        questionRepository.save(q1);
        answerRepository.save(a1);
        questionRepository.save(q2);
        answerRepository.save(a2);

    }
}

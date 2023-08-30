package com.hibernate.OneToManyrepository;

import com.hibernate.OneToMantyentity.Answer;
import com.hibernate.OneToMantyentity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {
}

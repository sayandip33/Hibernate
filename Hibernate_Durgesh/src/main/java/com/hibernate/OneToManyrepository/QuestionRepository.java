package com.hibernate.OneToManyrepository;

import com.hibernate.OneToMantyentity.Question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
}

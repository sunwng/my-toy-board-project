package com.mysite.sunwngboard;

import com.mysite.sunwngboard.answer.AnswerRepository;
import com.mysite.sunwngboard.question.QuestionRepository;
import com.mysite.sunwngboard.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionService questionService;

}

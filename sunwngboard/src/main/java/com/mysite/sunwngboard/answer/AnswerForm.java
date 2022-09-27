package com.mysite.sunwngboard.answer;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class AnswerForm {
    @NotEmpty(message="내용을 입력하샘")
    private String content;
}
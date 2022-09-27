package com.mysite.sunwngboard.question;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message="제목은 필수로 입력해야함")
    @Size(max=200)
    private String subject;

    @NotEmpty(message="내용은 필수임")
    private String content;
}
package com.mysite.sbb.Question;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QuestionForm {
    @NotEmpty(message="제목을 입력해주세요")
    @Size(max=200)
    private String content;
}

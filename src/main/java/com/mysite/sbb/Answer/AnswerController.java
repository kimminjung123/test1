package com.mysite.sbb.Answer;


import com.mysite.sbb.Question.Question;
import com.mysite.sbb.Question.QuestionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {
    private final QuestionService questionService;
    private  final  AnswerService answerService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id, @Valid AnswerForm answerForm, BindingResult bindingResult){
        Question q = this.questionService.getQuestion(id);

        if(bindingResult.hasErrors()){
            model.addAttribute("question", q);
            return "question_detail";
        }
        Answer answer = this.answerService.create(q, answerForm.getContent());
        return "redirect:/question/detail/%d".formatted(id);
    }
}

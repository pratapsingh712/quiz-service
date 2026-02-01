package com.raghav.quiz_service.feign;

import com.raghav.quiz_service.model.QuestionWrapper;
import com.raghav.quiz_service.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {

    public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions);

    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds);

    public ResponseEntity<Integer> getScore(List<Response> responses);

}

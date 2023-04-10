package com.example.internatinalization_mysql.service;


import com.example.internatinalization_mysql.entity.Survey;
import com.example.internatinalization_mysql.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;


    public List<Survey> getAllContent() {
        return  surveyRepository.findAll();

    }
    public List<Survey> getContentByEmail(String email) {
        return  surveyRepository.findByEmail(email);

    }
    public Survey saveData(Survey survey) {
        System.out.println(survey);
        return surveyRepository.save(survey);
    }

    public Survey findById(Integer id){
        return surveyRepository.findById(id).orElseThrow(()-> new RuntimeException("Survey not found"));
    }


    public Survey getAllById(Integer id) {
        return surveyRepository.findById(id).orElseThrow(() -> new RuntimeException("Survey not found"));
    }
}

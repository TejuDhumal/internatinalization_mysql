package com.example.internatinalization_mysql.controller;

import com.example.internatinalization_mysql.dto.SurveyEnDto;
import com.example.internatinalization_mysql.dto.SurveySwDto;
import com.example.internatinalization_mysql.entity.Survey;
import com.example.internatinalization_mysql.service.SurveyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private SurveyService surveyService;


    @GetMapping("get/all")
    public List<Survey> getContentAll(){
        return surveyService.getAllContent();
    }

    @GetMapping("/{id}/{lang}")
    public ResponseEntity<Object> getById(@PathVariable Integer id, @PathVariable String lang){

        Survey survey = surveyService.findById(id);
        if(lang.equals("en")){
            ModelMapper mapper = new ModelMapper();
            SurveyEnDto surveyEnDto = mapper.map(survey, SurveyEnDto.class);
            return ResponseEntity.ok(surveyEnDto);

        } else if (lang.equals("sw")) {
            ModelMapper mapper = new ModelMapper();
            SurveySwDto surveySwDto = mapper.map(survey, SurveySwDto.class);
            return ResponseEntity.ok(surveySwDto);

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
    }

    @GetMapping("get/{email}")
    public List<Survey> getByEmail(@PathVariable String email){
        return surveyService.getContentByEmail(email);
    }
    @GetMapping("id/{id}")
    public Survey getAllById(@PathVariable Integer id){
        return surveyService.getAllById(id);
    }


    @PostMapping("post")
    public Survey postContent(@RequestBody Survey survey){
        return surveyService.saveData(survey);
    }
}


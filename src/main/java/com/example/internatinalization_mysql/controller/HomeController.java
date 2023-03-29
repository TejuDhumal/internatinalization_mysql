package com.example.internatinalization_mysql.controller;
import com.example.internatinalization_mysql.entity.Language;
import com.example.internatinalization_mysql.service.LanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {


    private LanguageService languageService;

    public HomeController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("get/en")
    public List<Language> getContentEn(){
        return languageService.getEnContentByLanguage();
    }

    @GetMapping("get/sw")
    public List<Language> getContentSw(){
        return languageService.getSwContentByLanguage();
    }

    @PostMapping("post")
    public Language postContent(@RequestBody Language language){
        return languageService.saveData(language);
    }
}


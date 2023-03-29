package com.example.internatinalization_mysql.service;

import com.example.internatinalization_mysql.entity.Language;
import com.example.internatinalization_mysql.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class LanguageService {

    private LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public List<Language> getEnContentByLanguage() {
        return  languageRepository.findBYLanguageEn();

    }
    public List<Language> getSwContentByLanguage() {
        return  languageRepository.findBYLanguageSw();

    }
    public Language saveData(Language language) {
        System.out.println(language);
        return languageRepository.save(language);
    }
}

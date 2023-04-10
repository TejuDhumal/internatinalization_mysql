package com.example.internatinalization_mysql.repository;




import com.example.internatinalization_mysql.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Integer> {
    List<Survey> findByEmail(String email);



//    List<Survey> findByLanguage(String language);



}

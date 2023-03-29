package com.example.internatinalization_mysql.repository;

import com.example.internatinalization_mysql.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {
    @Query(value = "select * from Language l where l.language='en'", nativeQuery = true)
    List<Language> findBYLanguageEn();


    @Query(value = "select * from Language l where l.language='sw'", nativeQuery = true)
    List<Language> findBYLanguageSw();

}

package com.example.internatinalization_mysql.dto;

import com.example.internatinalization_mysql.entity.Response;
import jakarta.persistence.ElementCollection;
import lombok.Data;

import java.util.List;

@Data
public class SurveySwDto {
    private String email;
    private String title;

    @ElementCollection
    private List<Response> sw;
}

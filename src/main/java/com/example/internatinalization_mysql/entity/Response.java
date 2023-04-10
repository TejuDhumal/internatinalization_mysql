package com.example.internatinalization_mysql.entity;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
//@Transactional
@Data
@NoArgsConstructor
@Embeddable
public class Response {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long Response_id;
    private String question;
    private String answer;

//    @ManyToOne
//    @JoinColumn(name = "fk_Language_id")
//   private Language language;

}

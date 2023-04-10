package com.example.internatinalization_mysql.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "language_id")
    private int id;
    private String email;
    private String title;



//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_language_id" , referencedColumnName = "id")
    @ElementCollection
    private List<Response> en;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_language_id" , referencedColumnName = "id")
    @ElementCollection
    private List<Response> sw;







}
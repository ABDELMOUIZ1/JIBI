package com.tech.jibi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Creditor{
    // creancier
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true,nullable = false)
    private String code;
    private String name;
    private String logoUrl;

    /*@OneToMany(mappedBy = "creditor")
    List<Debt> debtList;*/


}

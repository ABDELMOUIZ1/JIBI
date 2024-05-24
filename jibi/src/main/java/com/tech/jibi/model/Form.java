package com.tech.jibi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Form implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "formulaire")
    private List<Field> champs;
    @OneToOne(fetch = FetchType.EAGER)
    private Creditor creditor;
}

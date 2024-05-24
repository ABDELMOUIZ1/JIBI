package com.tech.jibi.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tech.jibi.serializer.HibernateProxySerializer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode(exclude = "form")
@AllArgsConstructor
@NoArgsConstructor
public class Debt implements Serializable {
    //Creance
    @Id @GeneratedValue
    private Long id;
    @Column(unique = true, nullable = false)
    private String code;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonSerialize(using = HibernateProxySerializer.class)
    private Creditor creditor;
    @OneToOne(fetch = FetchType.EAGER)
    private Form form;
}

package com.tech.jibi.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tech.jibi.serializer.HibernateProxySerializer;
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
public class Unpaid implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private Double price;
    private String type;
    private Boolean isPaid;
    private Long date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonSerialize(using = HibernateProxySerializer.class)
    private Debt debt;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "impaye")
    List<UnpaidCredential> credentials;
}

package com.tech.jibi.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tech.jibi.serializer.HibernateProxySerializer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    @Id@GeneratedValue
    private Long id;
    private String type;
    private String description;
    private Long date;
    private Double amount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonSerialize(using = HibernateProxySerializer.class)
    @ToString.Exclude
    private BankAccount bankAccount;
}

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
public class Payement {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Long timestamp;
    private String CardNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonSerialize(using = HibernateProxySerializer.class)
    @ToString.Exclude
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonSerialize(using = HibernateProxySerializer.class)
    @JoinColumn(nullable = false)
    private Unpaid unpaid;
}

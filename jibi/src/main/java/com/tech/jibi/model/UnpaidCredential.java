package com.tech.jibi.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tech.jibi.model.Unpaid;
import com.tech.jibi.serializer.HibernateProxySerializer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnpaidCredential implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String credName;
    private String credValue;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonSerialize(using = HibernateProxySerializer.class)
    private Unpaid unpaid;
}

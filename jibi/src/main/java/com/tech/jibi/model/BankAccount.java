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
public class BankAccount implements Serializable {
    @Id@GeneratedValue
    private Long id;
    private String accountNumber;
    private Double AccountBalance;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Operation> operations;
}

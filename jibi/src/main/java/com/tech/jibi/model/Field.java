package com.tech.jibi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Field implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String type;
    private String name;
    private String value;
    private String label;
    @ManyToOne
    private Form form;
}

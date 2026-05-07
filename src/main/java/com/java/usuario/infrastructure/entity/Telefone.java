package com.java.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

//o lombok implementa todos os getters e setters e construtores
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "telefone")
@Builder
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero" , length = 10)
    private String numero;
    @Column(name = "ddd", length = 3)
    private String ddd;
}


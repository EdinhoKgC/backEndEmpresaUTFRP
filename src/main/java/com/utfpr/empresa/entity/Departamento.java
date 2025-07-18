package com.utfpr.empresa.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "departamento")
@Data
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Integer idDepartamento;

    @Column(name = "nome_departamento")
    private String nomeDepartamento;
}

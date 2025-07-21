package com.utfpr.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "funcionario")
@NamedQuery(
        name = "Funcionario.byQtdDependentes",
        query = "SELECT f FROM Funcionario f where f.qtdDependentes = ?1"
)
@NamedNativeQuery(
        name = "Funcionario.byName",
        query = "SELECT * FROM funcionario WHERE nome_funcionario LIKE CONCAT('%', ?, '%')\n",
        resultClass = Funcionario.class
)
@Data
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Integer idFuncionario;

    @Column(name = "nome_funcionario")
    private String nomeFuncionario;

    @Column(name = "qtd_dependentes")
    private Integer qtdDependentes;

    @Column(name = "salario")
    private BigDecimal salario;

    @Column(name = "cargo")
    private String cargo;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;

}

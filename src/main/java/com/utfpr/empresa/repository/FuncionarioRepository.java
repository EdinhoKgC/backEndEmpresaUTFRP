package com.utfpr.empresa.repository;

import com.utfpr.empresa.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    Funcionario findByNomeFuncionarioAndQtdDependentes(String nomeFuncionario, Integer qtdDependentes);

    @Query("SELECT f FROM Funcionario f WHERE f.departamento.nomeDepartamento = ?1")
    List<Funcionario> listarFuncionariosDepatamento(String nomeDepartamento);

    Funcionario findFirstByOrderBySalarioDesc();

    List<Funcionario> findTop3ByOrderBySalarioDesc();

    @Query("SELECT f FROM Funcionario f WHERE f.qtdDependentes = 0 OR f.qtdDependentes IS NULL")
    List<Funcionario> listarFuncionariosSemDependentes();

    @Query("SELECT f FROM Funcionario f WHERE f.salario > ?1")
    List<Funcionario> listarFuncionariosComMaioresSalariosQue(BigDecimal salario);

    @NativeQuery("SELECT * FROM funcionario WHERE salario > ?1")
    List<Funcionario> listarFuncionariosComMaioresSalariosQueNativeQuery(BigDecimal salario);

    @Query(name = "Funcionario.byQtdDependentes")
    List<Funcionario> findFuncionariosByQtdDependentes(Integer qtdDependentes);

    @Query(name = "Funcionario.byName")
    List<Funcionario> findByNomeFuncionario(String nome);

}

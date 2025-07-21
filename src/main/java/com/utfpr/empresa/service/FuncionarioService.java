package com.utfpr.empresa.service;

import com.utfpr.empresa.entity.Funcionario;
import com.utfpr.empresa.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FuncionarioService {

    private FuncionarioRepository repository;

    @Autowired
    public FuncionarioService(FuncionarioRepository repository){
        this.repository = repository;
    }

    public List<Funcionario> listarTodosFuncionarios(){
        return repository.findAll();
    }

    public Funcionario listarNomeQtdDependentes(String nomeFuncionario, Integer qtdDependentes){
        return repository.findByNomeFuncionarioAndQtdDependentes(nomeFuncionario, qtdDependentes);
    }

    public List<Funcionario> listarFuncionariosDepartamento(String nomeDepartamento){
        return repository.listarFuncionariosDepatamento(nomeDepartamento);
    }

    public Funcionario listarFuncionarioMaiorSalario(){
        return repository.findFirstByOrderBySalarioDesc();
    }

    public List<Funcionario> listarTop3FuncionariosMaiorSalario(){
        return repository.findTop3ByOrderBySalarioDesc();
    }

    public List<Funcionario> listarFuncionariosSemDependentes(){
        return repository.listarFuncionariosSemDependentes();
    }

    public List<Funcionario> listarFuncionariosComMaioresSalariosQue(BigDecimal salario){
        return repository.listarFuncionariosComMaioresSalariosQue(salario);
    }

    public List<Funcionario> listarFuncionariosComMaioresSalariosQueNativeQuery(BigDecimal salario){
        return repository.listarFuncionariosComMaioresSalariosQueNativeQuery(salario);
    }

    public List<Funcionario> findFuncionariosByQtdDependentes(Integer qtdDependentes){
        return repository.findFuncionariosByQtdDependentes(qtdDependentes);
    }

    public List<Funcionario> findByNomeFuncionario(String nome){
        return repository.findByNomeFuncionario(nome);
    }

}

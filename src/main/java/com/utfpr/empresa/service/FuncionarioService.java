package com.utfpr.empresa.service;

import com.utfpr.empresa.entity.Funcionario;
import com.utfpr.empresa.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}

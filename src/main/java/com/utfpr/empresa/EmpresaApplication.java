package com.utfpr.empresa;

import com.utfpr.empresa.entity.Departamento;
import com.utfpr.empresa.entity.Funcionario;
import com.utfpr.empresa.service.DepartamentoService;
import com.utfpr.empresa.service.FuncionarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmpresaApplication {

	private static final Logger log = LoggerFactory.getLogger(EmpresaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmpresaApplication.class, args);
	}


	@Bean
	public CommandLineRunner lr(DepartamentoService departamentoService, FuncionarioService funcionarioService){

		return (args) -> {

			log.info("");
			log.info("");
			log.info("==========Listando todos os departamentos==========");

			for (Departamento dep: departamentoService.listarTodosDepartamentos()){
				log.info(dep.toString());
			}

			log.info("");
			log.info("");
			log.info("==========Listando todos os funcionarios==========");

			for (Funcionario func: funcionarioService.listarTodosFuncionarios()){
				log.info(func.toString());
			}

		};

	}

}


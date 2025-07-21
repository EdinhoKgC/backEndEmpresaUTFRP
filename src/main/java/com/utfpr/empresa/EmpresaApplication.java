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

import java.math.BigDecimal;

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

			log.info("");
			log.info("QUESTÃO 1");
			log.info("==========listando funcionario pelo nome e qtd dependentes==========");

			Funcionario funcionario = funcionarioService.listarNomeQtdDependentes("Thiago Ribeiro", 0);

			if(funcionario != null){
				log.info(funcionario.toString());
			}
			else {
				log.info("Funcionário não encontrado!");
			}

			log.info("");
			log.info("QUESTÃO 2");
			log.info("==========listando funcionarios pelo departamento==========");

			for(Funcionario funcDep: funcionarioService.listarFuncionariosDepartamento("Financeiro")){
				log.info(funcDep.toString());
			}

			log.info("");
			log.info("QUESTÃO 3");
			log.info("==========Listando primeiro departamento cadastrado==========");

			Departamento primeiroDepCadastrado = departamentoService.listarPrimeiroDepartamento();

			log.info(primeiroDepCadastrado.toString());

			log.info("");
			log.info("QUESTÃO 4");
			log.info("==========Listando funcionario com maior salario==========");

			Funcionario funcMaiorSalario = funcionarioService.listarFuncionarioMaiorSalario();

			log.info(funcMaiorSalario.toString());

			log.info("");
			log.info("QUESTÃO 5");
			log.info("==========Listando 3 funcionarios com maior salario==========");

			for(Funcionario funcTop3Sal : funcionarioService.listarTop3FuncionariosMaiorSalario()){
				log.info(funcTop3Sal.toString());
			}

			log.info("");
			log.info("QUESTÃO 6");
			log.info("==========Listando funcionarios sem dependentes==========");

			for(Funcionario funcSemDep : funcionarioService.listarFuncionariosSemDependentes()){
				log.info(funcSemDep.toString());
			}

			log.info("");
			log.info("QUESTÃO 7");
			log.info("==========Listando funcionarios com salarios maiores que o fornecido JPQL==========");

			for (Funcionario funcMaiorSal : funcionarioService.listarFuncionariosComMaioresSalariosQue(BigDecimal.valueOf(7000))){
				log.info(funcMaiorSal.toString());
			}

			log.info("");
			log.info("QUESTÃO 8");
			log.info("==========Listando funcionarios com salarios maiores que o fornecido Native Query==========");

			for (Funcionario funcMaiorSalNative : funcionarioService.listarFuncionariosComMaioresSalariosQueNativeQuery(BigDecimal.valueOf(8000))){
				log.info(funcMaiorSalNative.toString());
			}

			log.info("");
			log.info("QUESTÃO 9");
			log.info("==========Listando funcionarios com qtd dependentes igual a fornecida NamedQuery==========");

			for(Funcionario funcQtdDep : funcionarioService.findFuncionariosByQtdDependentes(2)){
				log.info(funcQtdDep.toString());
			}

			log.info("");
			log.info("QUESTÃO 10");
			log.info("==========Listando funcionarios com o nome fornecido LIKE==========");

			for(Funcionario funcNome : funcionarioService.findByNomeFuncionario("ana")){
					log.info(funcNome.toString());
			}

		};

	}

}


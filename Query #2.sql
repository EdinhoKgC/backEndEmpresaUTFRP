USE empresa;

INSERT INTO departamento (nome_departamento) VALUES
    ('Recursos Humanos'),
    ('Financeiro'),
    ('Tecnologia da Informação'),
    ('Marketing'),
    ('Logística');

INSERT INTO funcionario (nome_funcionario, qtd_dependentes, salario, cargo, id_departamento) VALUES
     ('Ana Paula Silva', 2, 4500.00, 'Analista de RH', 1),
     ('Bruno Souza', 0, 6000.00, 'Gerente Financeiro', 2),
     ('Carlos Alberto', 1, 7500.00, 'Desenvolvedor Sênior', 3),
     ('Daniela Lima', 3, 5200.00, 'Analista de Marketing', 4),
     ('Eduardo Ramos', 2, 4800.00, 'Assistente de Logística', 5),
     ('Fernanda Castro', 0, 8500.00, 'Tech Lead', 3),
     ('Gustavo Nunes', 1, 3500.00, 'Assistente Financeiro', 2),
     ('Helena Martins', 0, 4200.00, 'Recrutadora', 1),
     ('Igor Vieira', 4, 4000.00, 'Designer Gráfico', 4),
     ('Juliana Costa', 2, 5000.00, 'Analista de Sistemas', 3);

INSERT INTO funcionario (nome_funcionario, qtd_dependentes, salario, cargo, id_departamento) VALUES
    ('Kleber Souza', 1, 3800.00, 'Assistente de RH', 1),
    ('Larissa Almeida', 3, 4700.00, 'Analista de RH', 1),
    ('Marcelo Pinto', 0, 9500.00, 'Gerente de TI', 3),
    ('Natália Araújo', 2, 5100.00, 'Analista de Marketing', 4),
    ('Otávio Mendes', 1, 6200.00, 'Coordenador Financeiro', 2),
    ('Patrícia Gomes', 0, 5500.00, 'Analista de Sistemas', 3),
    ('Rafael Dias', 2, 4900.00, 'Assistente de Logística', 5),
    ('Sandra Costa', 1, 4300.00, 'Designer Gráfico', 4),
    ('Thiago Ribeiro', 0, 7800.00, 'Desenvolvedor Sênior', 3),
    ('Ursula Lopes', 3, 5200.00, 'Analista de RH', 1),
    ('Vinícius Martins', 2, 4100.00, 'Recrutador', 1),
    ('William Fernandes', 0, 6700.00, 'Coordenador de Marketing', 4),
    ('Yasmin Cardoso', 4, 5700.00, 'Analista de Sistemas', 3),
    ('Zilda Castro', 1, 6000.00, 'Analista Financeiro', 2),
    ('Arthur Nascimento', 0, 5800.00, 'Desenvolvedor Pleno', 3),
    ('Beatriz Ferreira', 2, 4900.00, 'Assistente Financeiro', 2),
    ('Caio Barbosa', 1, 5300.00, 'Analista de Logística', 5),
    ('Diana Freitas', 0, 7300.00, 'Tech Lead', 3),
    ('Eduarda Pires', 3, 4700.00, 'Analista de RH', 1),
    ('Felipe Moreira', 2, 6800.00, 'Gerente de Marketing', 4),
    ('Giovana Rocha', 1, 5200.00, 'Designer Gráfico', 4),
    ('Henrique Silva', 2, 4900.00, 'Assistente de Logística', 5),
    ('Isadora Melo', 0, 4400.00, 'Recrutadora', 1),
    ('Jorge Lima', 2, 7000.00, 'Desenvolvedor Sênior', 3),
    ('Lívia Cunha', 1, 3900.00, 'Assistente de RH', 1);

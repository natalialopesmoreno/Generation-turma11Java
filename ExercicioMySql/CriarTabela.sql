USE rh_funcionarios;

CREATE TABLE funcionarios
(	ID_func BIGINT AUTO_INCREMENT NOT NULL,
	nome VARCHAR(40),
    setor VARCHAR(40),
    salario DECIMAL(8,2),
    periodo enum('Matutino', 'Vespetino', 'Noturno', 'Integral'),
    horas_trabalhadas int,

primary key(ID_func)
);
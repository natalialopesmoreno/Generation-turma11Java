#INSERT INTO funcionarios(nome, setor, salario, periodo, horas_trabalhadas) 
#value ('SERGIO', 'Engenharia', '15000.00', 'Integral', '10');

INSERT INTO funcionarios(nome, setor, salario, periodo, horas_trabalhadas) 
value ('MARIA', 'T.I', '10000.00', 'Integral', '8');

INSERT INTO funcionarios(nome, setor, salario, periodo, horas_trabalhadas) 
value ('LUANA', 'CEO', '20000.00', 'Integral', '12');

INSERT INTO funcionarios(nome, setor, salario, periodo, horas_trabalhadas) 
value ('MARCIO', 'LIMPEZA', '2000.00', 'Noturno', '6');

INSERT INTO funcionarios(nome, setor, salario, periodo, horas_trabalhadas) 
value ('BRUNO', 'LIMPEZA', '1000.00', 'Matutino', '6');

INSERT INTO funcionarios(nome, setor, salario, periodo, horas_trabalhadas) 
value ('MIA', 'RH', '8000.00', 'Vespetino', '6');

SELECT * FROM funcionarios;

Delete from funcionarios where ID_func = 4;
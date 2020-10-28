SELECT * FROM tb_funcionarios INNER JOIN tb_cargo 
WHERE tb_funcionarios.id_cargo = tb_cargo.id_cargo and tb_cargo.salario > 2000.00;

#INNER JOIN
SELECT * FROM tb_funcionarios INNER JOIN tb_cargo 
ON tb_funcionarios.id_cargo = tb_cargo.id_cargo and tb_cargo.salario > 1000.00 and tb_cargo.salario < 2000.00 ;

SELECT * FROM tb_funcionarios WHERE nome like 'C%';

#RIGHT JOIN- ordem de organização da tabela leva em consideração a segunda tabela

SELECT * FROM tb_funcionarios RIGHT JOIN tb_cargo 
ON tb_funcionarios.id_cargo = tb_cargo.id_cargo ;

#LEFT JOIN- ordem de organização da tabela leva em consideração a primeira tabela

SELECT * FROM tb_funcionarios LEFT JOIN tb_cargo 
ON tb_funcionarios.id_cargo = tb_cargo.id_cargo ;

#INNER JOIN - só resgata aqueles dados que tiverem a chava estrangeira preenchida

SELECT * FROM tb_funcionarios INNER JOIN tb_cargo 
ON tb_funcionarios.id_cargo = tb_cargo.id_cargo ;
INSERT INTO tb_cargo (nome, salario)value
("Desenvovedor BackEnd Jr", "4000.00"),
("Desenvovedor FrontEnd Jr", "4000.00"),
("Desenvovedor FullStack Jr", "5000.00"),
("Estágio de Desenvovedor ", "1500.00");

INSERT INTO tb_funcionarios(nome, idade, sexo, id_cargo)values
("Natalia", "25", "F", "1"),
("Jacqueline", "30", "F", "2"),
("Bruno", "28", "M", "3"),
("João", "18", "M", "4");

SELECT*FROM tb_funcionarios;
SELECT*FROM tb_cargo;

SELECT * FROM tb_funcionarios INNER JOIN tb_cargo WHERE tb_funcionarios.id_cargo = tb_cargo.id_cargo;
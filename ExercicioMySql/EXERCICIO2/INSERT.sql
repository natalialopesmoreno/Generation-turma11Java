INSERT INTO tb_cargo (nome, salario)value
("Desenvovedor BackEnd Jr", "4000.00"),
("Desenvovedor FrontEnd Jr", "4000.00"),
("Desenvovedor FullStack Jr", "5000.00"),
("Estágio de Desenvovedor ", "1500.00");
Insert into tb_cargo(nome, salario)value("Quality Assurance(QA)", "2000.00");

INSERT INTO tb_funcionarios(nome, idade, sexo, id_cargo)values
("Natalia", "25", "F", "1"),
("Jacqueline", "30", "F", "2"),
("Bruno", "28", "M", "3"),
("João", "18", "M", "4");


INSERT INTO tb_funcionarios(nome, idade, sexo, id_cargo)values
("Juliana", "29", "F", "5"),
("Rubens", "50", "M", "2"),
("Maria", "35", "F", "5"),
("Mia", "17", "F", "4"),
("Theodoro", "23", "M", "1"),
("Marco Antônio", "42", "M", "3"),
("Athena", "21", "Outros", "2"),
("Apolo", "31", "Outros", "5"),
("Coraline", "25", "F", "3");

USE db_rh2;
insert into tb_funcionarios (nome, idade, sexo)values
("Jorge", "45", "M"),
("Mariana", "23", "F"),
("Paloma", "20", "F");



SELECT*FROM tb_funcionarios;
SELECT*FROM tb_cargo;


SELECT * FROM tb_funcionarios INNER JOIN tb_cargo WHERE tb_funcionarios.id_cargo = tb_cargo.id_cargo;
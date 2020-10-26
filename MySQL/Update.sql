CREATE TABLE funcionarios(
nome VARCHAR(30),
idade tinyint,
sexo CHAR(1),
peso float,
altura float, 
nacionalidade VARCHAR(20)

);

INSERT INTO funcionarios VALUES
("Jacqueline", 30, "f",60, 1.65,"Brasileira"),
("Marina", 28, "f",60, 1.65,"Brasileira"),
("Luiza", 27, "f",60, 1.65,"Brasileira"),
("Carla", 29, "f",60, 1.65,"Brasileira");
INSERT INTO funcionarios(nome, sexo) VALUES("Marcio", "f");

DELETE FROM funcionarios WHERE nome = "Marcio" ;

UPDATE funcionarios SET nacionalidade = "Argentino" WHERE nome = "Carla";

SELECT*FROM funcionarios;


SHOW tables;
describe funcionarios;


SET SQL_SAFE_UPDATES = 0;

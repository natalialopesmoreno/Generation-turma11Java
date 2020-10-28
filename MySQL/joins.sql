CREATE DATABASE joins;
USE  joins;

CREATE TABLE endereco_cliente(
cliente_id1 INT (11) NOT NULL,
cliente_endereco TEXT,
PRIMARY KEY(cliente_id1));

CREATE TABLE cliente(
cliente_id0 int primary key auto_increment,
nome varchar(100)
);

SELECT * FROM cliente;
SELECT * FROM endereco_cliente;

insert into cliente values
		(1, "João Marcio"),	
        (2, "Juliana"),	
        (3, "João Marcio"),
        (4, "Gabriela"),    
        (6, "Fabio"),    
        (7, "Juliana");   
        
        INSERT INTO endereco_cliente VALUES
	(1, 'Rua Faria lima, Centro, São Paulo'),
    (2, 'Rua Osvaldo Cruz,Campinas, São Paulo'),
    (3, 'Rua Rosana, Sinara, Nova Esperança'),
    (4, 'Av. Bias Fortes, Centro, Brasília'),
    (5, 'Beatles, Santa Cruz, Rio de Janeiro'),
    (6, 'Av. Esquerda, Vila Pinheiro, New York');

SELECT * FROM cliente INNER JOIN endereco_cliente 
ON cliente.cliente_id0 = endereco_cliente.cliente_id1;

SELECT * FROM cliente RIGHT JOIN endereco_cliente 
ON cliente.cliente_id0 = endereco_cliente.cliente_id1;

SELECT * FROM cliente LEFT JOIN endereco_cliente 
ON cliente.cliente_id0 = endereco_cliente.cliente_id1;

#NESSE COMANDO ELE PEGA TODOS OS DADOS QUE EXISTEM NA TABELA CLIENTE MAS NÃO TEM ENDERECO CLIENTE
SELECT * FROM cliente LEFT JOIN endereco_cliente 
ON cliente.cliente_id0 = endereco_cliente.cliente_id1 
WHERE endereco_cliente.cliente_id1 is null;

#NESSE COMANDO ELE PEGA TODOS OS DADOS QUE EXISTEM NA TABELA CLIENTE MAS NÃO TEM ENDERECO CLIENTE
SELECT * FROM cliente RIGHT JOIN endereco_cliente 
ON cliente.cliente_id0 = endereco_cliente.cliente_id1 
WHERE cliente.cliente_id0 is null;


CREATE TABLE copia_clientes SELECT * FROM cliente; 
CREATE TABLE copia_endereco_clientes SELECT * FROM endereco_cliente; 

CREATE TABLE copia_inner SELECT * FROM cliente INNER JOIN endereco_cliente 
ON cliente.cliente_id0 = endereco_cliente.cliente_id1;

Select*from copia_inner;
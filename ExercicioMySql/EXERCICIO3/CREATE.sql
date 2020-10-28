CREATE DATABASE db_cidade_das_carnes;
USE  db_cidade_das_carnes;

CREATE TABLE tb_categoria
( id_categoria int not null auto_increment primary key,
nome varchar(30),
marca varchar(30)
);



CREATE TABLE tb_produto
( id_produto int not null auto_increment primary key,
nome varchar(30),
quantidade int,
id_categoria int,
validade date,
constraint fk_produto_categoria foreign key(id_categoria) references tb_categoria(id_categoria)
);

#ALTER TABLE tb_produto ADD column preco DECIMAL(6,2);




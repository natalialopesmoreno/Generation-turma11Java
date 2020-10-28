CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

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
peso_kg DECIMAL(5,3),
cor varchar(20),
constraint fk_produto_categoria foreign key(id_categoria) references tb_categoria(id_categoria)
);
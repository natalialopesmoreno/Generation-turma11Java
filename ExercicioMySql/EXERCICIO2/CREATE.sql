USE db_rh2;

CREATE TABLE tb_cargo(
id_cargo bigint not null auto_increment,
nome varchar(45),
salario decimal(8,2),
primary key (id_cargo)
) engine= InnoDB;

CREATE TABLE tb_funcionarios(
id_funcionarios bigint not null auto_increment  primary key ,
nome varchar(45),
idade int,
sexo enum("F", "M", "Outros"),
id_cargo bigint,
constraint fk_funcionario_cargo foreign key(id_cargo) references tb_cargo(id_cargo)

)engine= InnoDB;



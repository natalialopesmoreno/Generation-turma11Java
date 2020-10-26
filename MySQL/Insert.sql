CREATE TABLE tb_venda(
	idVenda SMALLINT PRIMARY KEY auto_increment,
	produto varchar(255) NOT NULL,
	preco DECIMAL (10,2) UNSIGNED,
	horarioVenda DATETIME DEFAULT CURRENT_TIMESTAMP,
	hora_Entrega time,
	data_Entrega date
    ) ENGINE=INNODB;
                    
INSERT INTO tb_venda(produto, preco, data_Entrega, hora_Entrega) VALUES ("Ecosport", 70000.00, "2020-12-03", "13:40:00");
SELECT * FROM tb_venda;



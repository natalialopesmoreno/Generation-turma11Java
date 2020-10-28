INSERT INTO tb_categoria (nome, marca) VALUES
("Peito de Frango", "Sadia"),
("Asa de Frango", "Perdigão"),
("Bolacha", "Maisena"),
("Nugget", "Seara"),
("Refrigerante", "Coca-cola"),
("Refrigerante", "Guaraná"),
("Refrigerante", "Fanta");
INSERT INTO tb_categoria (nome, marca) VALUES("Chocolate", "Lindt");

/*UPDATE tb_categoria
SET nome = 'Empanados'
WHERE id_categoria = 4;*/

select *from tb_categoria;

INSERT INTO tb_produto (nome, quantidade, id_categoria, validade, preco) VALUES
("Peito de Frango", "10", "1", "2020-10-30", "15.99"),
("Sobrecoxa de Frango", "10", "2", "2020-10-31", "10.99"),
("Caixa de bombom chocolate suiço", "10", "8", "2020-10-31", "60.00"),
("Bolacha de leite", "10", "3", "2020-12-31", "4.99"),
("Coca zero ", "10", "5", "2021-10-31", "8.99"),
("Guaraná lata", "10", "6", "2021-10-31", "7.99"),
("Nugget de frango", "10", "4", "2021-10-31", "15.99"),
("Fanta Uva", "10", "7", "2021-09-31", "6.99");

INSERT INTO tb_produto (nome, quantidade, validade, preco) VALUES
("H2O", "10", "2021-02-22", "5.99");

select*from tb_produto;



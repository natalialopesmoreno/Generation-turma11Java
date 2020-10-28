INSERT INTO tb_categoria (nome, marca) VALUES
("Tinta", "Coral"),
("Hidráulica", "Tigre"),
("Estrutura", "Votran"),
("Elétrica", "Tigre"),
("Telhado", "Onduline");

Select*from tb_categoria;

INSERT INTO tb_produto (nome, quantidade, id_categoria, peso_kg, cor, preco) VALUES
("Tinta-parede-super-concentrada", "10", "1", "15", "rosê","150.00"),
("Tinta-parede-super-concentrada", "10", "1", "15", "vermelha","200.00"),
("Cano -T", "10", "2", "0.500", "bege","5.00"),
("Cimento", "10", "3", "20", "cinza","50.00"),
("Tijolo", "10", "3", "20", "tradicional","30.00"),
("Cabo", "10", "4", "0.100", "preto","8.00"),
("Tomada", "10", "4", "0.100", "bege","2.00"),
("Telha", "10", "5", "5", "marrom","55.00");

Select*from tb_produto;


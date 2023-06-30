USE db_lojadegames;

INSERT INTO tb_produtos(console, descricao, nome, preco, quantidade) 
VALUES ('Nintendo', 'Super Mario Odyssey Nintendo Switch Versão Digital', 'Super Mario', 299.00, 5);
INSERT INTO tb_produtos(console, descricao, nome, preco, quantidade) 
VALUES ('Xbox ', 'It Takes Two Xbox', 'It Takes Two', 199.00, 3);
INSERT INTO tb_produtos(console, descricao, nome, preco, quantidade)
VALUES ('Jogos PC', 'Mortal Kombat 11 - Standard Edition', 'Mortal Kombat 11',  159.99, 7);
INSERT INTO tb_produtos(console, descricao, nome, preco, quantidade)
VALUES ('Nintendo', 'Horizon Zero Dawn Complete Edition', 'Horizon Zero Dawn', 200.00, 4);
INSERT INTO tb_produtos(console, descricao, nome, preco, quantidade)
VALUES ('Xbox', 'EA SPORTS FIFA 23 Edição Standard', 'FIFA 23', 299.00, 5);
INSERT INTO tb_produtos(console, descricao, nome, preco, quantidade)
VALUES ('Jogos PC','RESIDENT EVIL 2 / BIOHAZARD RE:2 - Deluxe Edition', 'RESIDENT EVIL 2',  109.99, 8);
INSERT INTO tb_produtos(console, descricao, nome, preco, quantidade)
VALUES ('Jogos PC','Red Dead Redemption 2. Key de ativação pelo Rockstar Club Launcher', 'Red Dead Redemption 2',  238.99, 5);
INSERT INTO tb_produtos(console, descricao, nome, preco, quantidade)
VALUES ('Xbox', 'Project CARS 3 Xbox', 'Project CARS 3',  249.90, 6);

SELECT * FROM tb_produtos;
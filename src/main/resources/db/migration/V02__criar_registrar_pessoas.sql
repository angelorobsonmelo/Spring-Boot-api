CREATE TABLE pessoa (
  codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  ativo BOOLEAN NOT NULL,
  logradouro VARCHAR(200) NOT NULL,
  numero VARCHAR(50) NOT NULL,
  bairro VARCHAR(150),
  cep VARCHAR(50),
  cidade VARCHAR(100),
  estado VARCHAR(50)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
values ('Ângelo Melo', TRUE, 'rua 666', '666', 'Centro', '57925-000', 'Maceió', 'Alagoas');

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
values ('José da Silva', TRUE, 'rua do josé', '11', 'Centro', '43333-33', 'Arapiraca', 'Alagoas');

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
values ('João', TRUE, 'rua do júlio', '12', 'Esqueina', '57925-333', 'Belém', 'Pará');

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
values ('Pereira', TRUE, 'rua pereira', '13', 'Augusta', '57925-543', 'São Paulo', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
values ('Manoel', TRUE, 'rua manoel', '14', 'Centro', '57925-543', 'Rio de Janeiro', 'Rio de Janeiro');

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
values ('Joaquim', TRUE, 'rua joaquim', '15', 'Jacaré', '45434-000', 'Curitiba', 'Paraná');

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
values ('Mendes', TRUE, 'rua mendes', '16', 'Santa rua', '57925-563', 'Santa cidade', 'Amapá');

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
values ('Ferreira', TRUE, 'rua ferreira', '17', 'Rua da liberdade', '57925-667', 'Maceió', 'Alagoas');

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
values ('Firmino', TRUE, 'rua firmino', '18', 'Avenida da paz', '57925-067', 'Goiânia', 'Goiás');

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
values ('Pablo', TRUE, 'rua pablo', '19', 'Pelorinho', '55443-000', 'Salvador', 'Bahia');

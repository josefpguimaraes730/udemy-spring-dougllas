-- SELECT datname FROM pg_database WHERE datistemplate = FALSE;

CREATE TABLE autor(
	id uuid NOT NULL PRIMARY KEY,
	nome varchar(100) NOT NULL,
	data_nacimento DATE NOT NULL,
	nacionalidade varchar(50) NOT null
);

CREATE TABLE livro (
	id uuid NOT NULL PRIMARY KEY,
	isbn VARCHAR(20) NOT NULL,
	titulo VARCHAR(150) NOT NULL,
	data_publicacao DATE NOT NULL,
	genero VARCHAR(30) NOT NULL,
	preco NUMERIC(18,2),
	id_autor uuid NOT NULL REFERENCES autor(id),
	CONSTRAINT chk_genero CHECK (genero IN ('FICCAO', 'FANTASIA', 'MISTERIO', 'ROMANCE', 'BIOGRAFIA', 'CIENCIA'))
);

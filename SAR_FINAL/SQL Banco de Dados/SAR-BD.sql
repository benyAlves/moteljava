-- Geração de modelo físico dos dados do projeto SAR da SistComp
-- No Prompt do MySql 5.1 execute:
-- DROP DATABASE sar;
-- CREATE DATABASE sar;
-- Após isso execute esse arquivo pelo NetBeans
-- OBS: a necessidade é por não conseguir executar alguns comandos SQL através do NetBeans

CREATE TABLE PESSOAS (
	idPessoa int unsigned not null auto_increment,
	nome varchar(75) not null,
	email varchar(50),
	nascimento date not null,
	sexo varchar(10) not null,
	cpf varchar(15)not null,
	rgNumero varchar(15) not null,
        rgUf varchar(2) not null,
	endereco varchar(75),
	bairro varchar(30),
	cidade varchar(30),
	estado char(2),
	cep varchar(15),
	telefone varchar(14),
	celular varchar(14),
        observacoes varchar(1500),
        dataCadastro date not null,
	PRIMARY KEY(idPessoa),
	UNIQUE (cpf)
);


CREATE TABLE ALUNOS (
        matricula int not null,
        indicacao varchar(75),
        bolsista varchar(8),
	PRIMARY KEY(matricula)
);

CREATE TABLE SECRETARIAS (
        matricula int not null,
	senha varchar(10) not null,
        PRIMARY KEY(matricula)
);

CREATE TABLE MODALIDADES(
	codModalidade int not null auto_increment,
	nome varchar(45) not null,
	ambiente varchar(30) not null,
        alunosPorTurma int not null,
	PRIMARY KEY (codModalidade)
);

CREATE TABLE PLANOS (
	codPlano int not null auto_increment,
	nome varchar(45) not null,
	duracao int not null,
        valor numeric(7,2) not null,
	codModalidade int not null,
        status varchar(7) not null,
	PRIMARY KEY (codPlano),
	FOREIGN KEY (codModalidade) REFERENCES modalidades(codModalidade)
);

CREATE TABLE ALUNO_PLANO (
	matricula int not null,
	codPlano int not null,
	dataAdesao date not null,
	FOREIGN KEY (matricula) REFERENCES alunos(matricula),
	FOREIGN KEY (codPlano) REFERENCES planos(codPlano),
	CONSTRAINT codAlunoPlano PRIMARY KEY (matricula, codPlano)
);

CREATE TABLE MENSALIDADES (
	codMensalidade int unsigned not null auto_increment,
        matricula int not null,
        nomeDoPlano varchar(45),
        nomeDaModalidade varchar(45),
	valor numeric(7,2) not null,
	desconto numeric(7,2) not null,
	vencimento date not null,
	pagamento date,
	PRIMARY KEY (codMensalidade),
        FOREIGN KEY (matricula) REFERENCES alunos(matricula)
);

CREATE TABLE PROFESSORES (
	matricula int not null,
	codModalidade int not null,
	PRIMARY KEY (matricula),
	FOREIGN KEY (codModalidade) REFERENCES modalidades(codModalidade)
);

CREATE TABLE TURMAS (
	codTurma int not null auto_increment,
	matricula int not null,
	horaInicio time not null,
	horaFinal time not null,
	PRIMARY KEY (codTurma),
	FOREIGN KEY (matricula) REFERENCES professores(matricula)
);

CREATE TABLE ALUNO_TURMA(
	matricula int not null,
	codTurma int not null,
	FOREIGN KEY (matricula) REFERENCES alunos(matricula),
	FOREIGN KEY (codTurma) REFERENCES turmas(codTurma),
	CONSTRAINT codAlunoTurma PRIMARY KEY (matricula, codTurma)
);

CREATE TABLE IMAGENS(
        idPessoa int unsigned not null,
        foto longblob not null,
        FOREIGN KEY (idPessoa) REFERENCES pessoas(idPessoa),
        PRIMARY KEY (idPessoa)
);

CREATE TABLE DIAS (
	codTurma int not null,
	segunda bool,
	terca bool,
	quarta bool,
	quinta bool,
	sexta bool,
	sabado bool,
	domingo bool,
	FOREIGN KEY (codTurma) REFERENCES turmas(codTurma),
	PRIMARY KEY (codTurma)
);
-- Geração de modelo físico dos dados do projeto SAR da SistComp
-- No Prompt do MySql 5.1 execute:
-- DROP DATABASE sar;
-- CREATE DATABASE sar;
-- Após isso execute esse arquivo pelo NetBeans
-- OBS: a necessidade é por não conseguir executar alguns comandos SQL através do NetBeans

CREATE TABLE PESSOAS (
	idPessoa int not null auto_increment,
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
        idPessoa int not null,
        matricula int not null,
	indicacao varchar(75),
        bolsista varchar(8),
        FOREIGN KEY(idPessoa) REFERENCES PESSOAS(idPessoa),
	PRIMARY KEY(matricula)
);

CREATE TABLE FUNCIONARIOS (
        idPessoa int not null,
        matricula int not null,
	funcao varchar(15) not null,
        FOREIGN KEY(idPessoa) REFERENCES PESSOAS(idPessoa),
        PRIMARY KEY(matricula)
);

CREATE TABLE MODALIDADES(
	codModalidade int not null auto_increment,
	nome varchar(45) not null,
	ambiente varchar(30) not null,
        alunosPorTurma int not null,
	PRIMARY KEY (codModalidade),
        UNIQUE(nome)
);

CREATE TABLE PLANOS (
	codPlano int not null auto_increment,
	nome varchar(45) not null,
	duracao int not null,
        valor numeric(7,2) not null,
	codModalidade int not null,
        status varchar(7) not null,
	PRIMARY KEY (codPlano),
	FOREIGN KEY (codModalidade) REFERENCES modalidades(codModalidade),
        UNIQUE(nome)
);

CREATE TABLE ALUNO_PLANO (
        codAdesao int not null auto_increment,
	matricula int not null,
	codPlano int not null,
	dataAdesao date not null,
        valor numeric(5,2),
        desconto numeric(5,2),
        parcelas int,
        formaPagamento varchar(17),
	FOREIGN KEY (matricula) REFERENCES alunos(matricula),
	FOREIGN KEY (codPlano) REFERENCES planos(codPlano),
	PRIMARY KEY (codAdesao)
);

CREATE TABLE MENSALIDADES (
	codMensalidade int unsigned not null auto_increment,
        matricula int not null,
	valor numeric(7,2) not null,
	desconto numeric(7,2) not null,
	vencimento date not null,
	pagamento date,
        codAdesao int not null,
        FOREIGN KEY (codAdesao) REFERENCES ALUNO_PLANO(codAdesao),
	PRIMARY KEY (codMensalidade),
        FOREIGN KEY (matricula) REFERENCES alunos(matricula)
);

CREATE TABLE PROFESSORES (
        idPessoa int not null,
	matricula int not null,
	codModalidade int not null,
	PRIMARY KEY (matricula),
	FOREIGN KEY (codModalidade) REFERENCES modalidades(codModalidade),
        FOREIGN KEY(idPessoa) REFERENCES PESSOAS(idPessoa)
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
        idPessoa int not null,
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
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

CREATE TABLE ADESOES (
        codAdesao int not null auto_increment,
	matricula int not null,
	codPlano int not null,
        dataAdesao date not null,
        valor numeric(5,2) not null,
        desconto numeric(5,2) not null,
        parcelas int not null,
        formaPagamento varchar(17) not null,
        status bool not null,
	FOREIGN KEY (matricula) REFERENCES alunos(matricula),
	FOREIGN KEY (codPlano) REFERENCES planos(codPlano),
	PRIMARY KEY (codAdesao)
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
        codAdesao int not null,
	FOREIGN KEY (matricula) REFERENCES alunos(matricula),
	FOREIGN KEY (codTurma) REFERENCES turmas(codTurma),
        FOREIGN KEY (codAdesao) REFERENCES ADESOES(codAdesao)
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

CREATE TABLE MOVIMENTACOES(
	codMovimentacao int unsigned not null auto_increment,
	matricula int not null,
	valor numeric(7,2) not null,
	vencimento date not null,
	hora time,
	tipo varchar(1) not null,
	PRIMARY KEY (codMovimentacao),
	FOREIGN KEY (matricula) REFERENCES FUNCIONARIOS(matricula)
);

CREATE TABLE MENSALIDADES(
	codMovimentacao int unsigned not null,
	codAdesao int not null,
	pagamento date,
	desconto numeric(7,2),
	FOREIGN KEY (codMovimentacao) REFERENCES MOVIMENTACOES(codMovimentacao),
	PRIMARY KEY (codMovimentacao),
	FOREIGN KEY (codAdesao) REFERENCES ADESOES(codAdesao)
);

CREATE TABLE CONTAS(
	codMovimentacao int unsigned not null,
	descricao varchar(70) not null,
	pagamento date,
	desconto numeric(7,2),
	FOREIGN KEY (codMovimentacao) REFERENCES MOVIMENTACOES(codMovimentacao),
	PRIMARY KEY (codMovimentacao)
);

CREATE TABLE TRANSFERENCIAS(
	codMovimentacao int unsigned not null,
        forma varchar(9) not null,
        historico varchar(50) not null,
	FOREIGN KEY (codMovimentacao) REFERENCES MOVIMENTACOES(codMovimentacao),
	PRIMARY KEY (codMovimentacao)
);

CREATE TABLE CAIXAS(
	codCaixa int not null auto_increment,
	status bool not null,
	dia date not null,
	saldo numeric(7,2) not null,
	PRIMARY KEY (codCaixa)
);

CREATE TABLE TRANSACOES(
	codCaixa int not null,
	codMovimentacao int unsigned not null,
	FOREIGN KEY (codCaixa) REFERENCES CAIXAS(codCaixa),
	FOREIGN KEY (codMovimentacao) REFERENCES MOVIMENTACOES(codMovimentacao),
	CONSTRAINT codTransferencia PRIMARY KEY (codCaixa, codMovimentacao)
);

CREATE TABLE ABRE(
        codCaixa int not null,
        matricula int not null,
        FOREIGN KEY (codCaixa) REFERENCES CAIXAS(codCaixa),
        FOREIGN KEY (matricula) REFERENCES FUNCIONARIOS(matricula),
        CONSTRAINT codAbriu PRIMARY KEY (codCaixa,matricula)
);

CREATE TABLE FECHA(
        codCaixa int not null,
        matricula int not null,
        FOREIGN KEY (codCaixa) REFERENCES CAIXAS(codCaixa),
        FOREIGN KEY (matricula) REFERENCES FUNCIONARIOS(matricula),
        CONSTRAINT codFechou PRIMARY KEY (codCaixa,matricula)
);

INSERT INTO PESSOAS (nome, email, nascimento, sexo, cpf, rgNumero,rgUf, endereco,bairro, cidade, estado, cep, telefone, celular, observacoes, dataCadastro)
VALUES ('PADRAO','PADRAO@PADRAO','2010-08-28','MASCULINO','111.111.111-11','111111','PB','PADRAO','PADRAO','PADRAO','PB','00.000-000','(  )     -    ','(  )     -    ','PADRAO','2010-08-28');

INSERT INTO FUNCIONARIOS (idPessoa, matricula, funcao)
VALUES (1,10810,'PADRAO');
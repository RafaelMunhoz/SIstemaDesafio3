create database hospitalFX;
use  hospitalFX;

alter table Funcionario change statusFuncionario statusDeUsuario varchar(200);

create table atendente(
idAtendente int not null AUTO_INCREMENT,
cargo varchar(50),
constraint PK_Atendente primary key(idAtendente));

create table Pessoa (
idPessoa int not null AUTO_INCREMENT,
nome varchar(50),
cpf varchar(50),
idade int,
tipoSanguineo varchar(50),
sexo varchar(50),
statusPessoa varchar(200),
constraint PK_Pessoa primary key(idPessoa));

create table Funcionario (
idFuncionario int not null AUTO_INCREMENT,
login varchar(50),
senha varchar(50),
statusFuncionario varchar(200),
idPessoa int,
constraint PK_Funcionario primary key(idFuncionario),
constraint FK_Fp foreign key (idPessoa) references Pessoa(idPessoa));

create table Gerente (
idGerente int not null AUTO_INCREMENT,
cargo varchar(50),
idFuncionario int,
constraint PK_Gerente primary key(idGerente),
constraint FK_Gf foreign key (idFuncionario) references Funcionario(idFuncionario));

create table Enfermeiro (
idEnfermeiro int not null AUTO_INCREMENT,
numeroRegistro varchar(50),
idFuncionario int,
constraint PK_Enfermeiro  primary key(idEnfermeiro),
constraint FK_Ef foreign key (idFuncionario) references Funcionario(idFuncionario));

create table Medico (
idMedico int not null AUTO_INCREMENT,
numeroRegistro varchar(50),
especialidade varchar(50),
idFuncionario int,
constraint PK_Medico primary key(idMedico),
constraint FK_Mf foreign key (idFuncionario) references Funcionario(idFuncionario)
);

create table Paciente (
idPaciente int not null AUTO_INCREMENT,
doenca varchar (300),
historico varchar (300),
constraint PK_Paciente primary key (idPaciente));

create table Entrada (
idEntrada int not null AUTO_INCREMENT,
dataEntrada date,
dataSaida date,
statusEntrada varchar(50),
situacaoPaciente varchar(300),
constraint PK_Entrada primary key (idEntrada));

create table Atendimento (
idAtendimento int not null AUTO_INCREMENT,
comentarioEnfermeiro varchar(100),
comentarioMedico varchar(100),
altura float,
peso float,
data date,
doenca varchar(300),
constraint PK_Atendimento primary key (idAtendimento));


create table EnfermidadePessoal (
idEnfermidadePessoal int not null AUTO_INCREMENT,
comentario varchar(100),
statusEnfermeiro varchar(100),
constraint PK_EnfermidadePessoal primary key (idEnfermidadePessoal));

create table Enfermidade(
idEnfermidade int not null AUTO_INCREMENT,
nome varchar(50),
tipo varchar(50),
descricao varchar(150),
constraint PK_Enfermidade primary key (idEnfermidade));
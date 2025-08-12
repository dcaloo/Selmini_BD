-- comando para apagar as tabelas
drop table java_despesa;
drop table java_categoria;

-- criação da tabela java_categoria
create table java_categoria (
    id_categoria number,
    categoria varchar2(50),
    primary key (id_categoria)
);
    
select * from java_categoria;
insert into java_categoria values (1, 'moradia');
insert into java_categoria values (2, 'alimentação');
select * from java_categoria;

-- Criação da tabela java_despesa
create table java_despesa (
    id_despesa number,
    descricao varchar2(100),
    valor number(10,2),
    data date,
    id_categoria number,
    primary key (id_despesa),
    foreign key (id_categoria) references java_categoria (id_categoria)
        on delete cascade
);
select * from java_despesa;
insert into java_despesa values(1, 'cantina fiap', 35, to_date('12/08/2025', 'dd/MM/yyyy'), 1);
insert into java_despesa values(2, 'aluguel de agosto', 2500, to_date('12/08/2025', 'dd/MM/yyyy'), 2);
select * from java_despesa;
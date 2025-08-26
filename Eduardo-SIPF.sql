select * from java_categoria;
select * from java_despesa;

update java_despesa set descricao = 'a' where id_despesa = 100;
delete from java_despesa where id_despesa = 100;

rollback;
commit;

create sequence seqc start with 1000 increment by 1;
create sequence seqd start with 1000 increment by 5;

insert into java_categoria values (seqc.nextval, 'alimentação');

-- select com inner join
select d.descricao, d.valor, d.data, c.categoria from java_despesa d inner join java_categoria c on d.id_categoria = c.id_categoria;
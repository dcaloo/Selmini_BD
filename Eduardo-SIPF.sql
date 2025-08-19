select d.descricao, d.valor, d.data, c.categoria
from java_despesa d
inner join java_categoria c
on d.id_categoria = c.id_categoria;
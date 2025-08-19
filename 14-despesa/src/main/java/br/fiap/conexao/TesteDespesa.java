package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.Despesa;
import br.fiap.modelo.DespesaDAO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TesteDespesa {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();
        String data = "19/08/2025";
        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        /*Despesa despesa = new Despesa();
        despesa.setId(100L);
        despesa.setDescricao("Viagem de uber para a FIAP");
        despesa.setValor(70.32);
        despesa.setData(LocalDate.parse(data, mascara));
        despesa.setCategoria(new Categoria(2L, ""));
        dao.inserir(despesa);*/


        // teste para listar todas as despesas
        List<Despesa> lista = dao.listar();
        for(Despesa despesa : lista) {
            System.out.println(despesa.getId());
            System.out.println(despesa.getDescricao());
            System.out.println("R$ " + despesa.getValor());
            System.out.println(despesa.getData().format(mascara));
            System.out.println(despesa.getCategoria().getId());
        }
    }
}

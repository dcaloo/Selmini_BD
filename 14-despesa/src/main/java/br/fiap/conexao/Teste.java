package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
      //  Categoria categoria = new Categoria(6L, "teste");
        CategoriaDAO dao = new CategoriaDAO();
        //dao.inserir(categoria);
        List<Categoria> lista = dao.listar();
        for(Categoria c : lista) {
            System.out.println(c.getId() + " --> " + c.getCategoria());
        }
    }
}

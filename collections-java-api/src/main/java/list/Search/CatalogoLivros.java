package main.java.list.Search;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) { 
                livroPorTitulo = l;
                break;
                }
            }
        }
        return livroPorTitulo; 
    }

    public static void main(String[] args) {
        CatalogoLivros catalogolivros = new CatalogoLivros();

        catalogolivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogolivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogolivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogolivros.adicionarLivro("Livro 4", "Autor 2", 2023);
        catalogolivros.adicionarLivro("Livro 5", "Autor 3", 2024);
        catalogolivros.adicionarLivro("Livro 5", "Autor 4", 2025);        

        System.out.println(catalogolivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogolivros.pesquisarPorIntervaloAnos(2022, 2024));
        System.out.println(catalogolivros.pesquisarPorTitulo("Livro 5"));
    }
}

package main.java.list.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoa() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorAltura, new ComparetorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Fillipe", 31, 1.72);
        ordenacaoPessoa.adicionarPessoa("Leonardo", 28, 1.68);
        ordenacaoPessoa.adicionarPessoa("Ricardo", 25, 1.74);
        ordenacaoPessoa.adicionarPessoa("Osmar", 61, 1.76);
        ordenacaoPessoa.adicionarPessoa("Dirlene", 54, 1.61);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

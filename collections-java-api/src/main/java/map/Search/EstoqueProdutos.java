package main.java.map.Search;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        if (estoqueProdutosMap.isEmpty()) {
            System.out.println("\nO estoque está vazio.");
        } else {
            System.out.println(estoqueProdutosMap);
        }
    }

    public double CalcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto ObterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto ObterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto ObterProdutoMaiorQuantidade() {
        Produto produtoMaiorQuantidade = null;
        int maiorQuantidade = Integer.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getQuantidade() > maiorQuantidade) {
                    maiorQuantidade = p.getQuantidade();
                    produtoMaiorQuantidade = p;
                }
            }
        }
        return produtoMaiorQuantidade;
    }

    public void removerProdutoPeloCod(long cod){
        if (!estoqueProdutosMap.isEmpty()) {
            estoqueProdutosMap.remove(cod);
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();
        
        estoqueProdutos.adicionarProduto(0001L, "Whey Protein - Natural", 90.0, 10);
        estoqueProdutos.adicionarProduto(0002L, "Whey Protein - Morango", 98.0, 30);
        estoqueProdutos.adicionarProduto(0003L, "Whey Protein - Chocolate", 99.0, 20);
        estoqueProdutos.adicionarProduto(0004L, "Whey Protein - Banana", 98.5, 25);

        estoqueProdutos.exibirProdutos();
        
        System.out.println("O Valor Total dos produtos em estoque é R$ " + estoqueProdutos.CalcularValorTotalEstoque());
        
        System.out.println("O produto mais caro é o: " + estoqueProdutos.ObterProdutoMaisCaro());
        System.out.println("O produto mais batato é o: " + estoqueProdutos.ObterProdutoMaisBarato());
        System.out.println("O produto em maior quantidade no estoque é o: " + estoqueProdutos.ObterProdutoMaiorQuantidade());
        
        estoqueProdutos.removerProdutoPeloCod(0004L);
        
        estoqueProdutos.exibirProdutos();

        System.out.println("O Valor Total dos produtos em estoque é R$ " + estoqueProdutos.CalcularValorTotalEstoque());
        
    }

}
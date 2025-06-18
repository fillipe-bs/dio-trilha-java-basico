package functional_interface.examples;

import java.util.List;
import java.util.function.BinaryOperator;

public class CalcularFaturamentoTotalComBinaryOperator {

    public static void main(String[] args) {
        
        List<Double> vendas = List.of(1000.5, 2000.2, 1500.8, 3000.0, 2500.5);
        
        BinaryOperator<Double> somaFaturamento = (a, b) -> a+ b;
        
        double faturamentoTotal = vendas.stream()
        .reduce(0.0, somaFaturamento);
        
        System.out.printf("Faturamento total: R$ %.2f%n", faturamentoTotal);
        
        BinaryOperator<Double> encontrarMaiorVenda = (a, b) -> a > b ? a : b;

        double maiorVenda = vendas.stream()
        .reduce(0.0, encontrarMaiorVenda);

        System.out.printf("Maior venda: R$ %.2f%n", maiorVenda);
    }
}

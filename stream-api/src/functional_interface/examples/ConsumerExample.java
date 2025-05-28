package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10, 11, 12, 13, 14, 15);

        // Consumer declarado separadamente e passado para forEach
        Consumer<Integer> imprimirNumerosPares = numero -> {
        if (numero % 2 == 0) {
        System.out.println(numero);
        }
        };
        numeros.stream().forEach(imprimirNumerosPares);
        // Separou-se a lógica de impressão criando um Consumer reutilizável, que depois foi passado para forEach. Facilita a reutilização, mas adiciona uma variável a mais.

        // Classe anônima implementando Consumer dentro do forEach
        // numeros.stream().forEach(new Consumer<Integer>() {
        // @Override
        // public void accept(Integer n) {
        // if (n % 2 == 0) {
        // System.out.println(n);
        // }
        // }
        // });
        // Substituiu a expressão lambda por uma classe anônima que implementa Consumer. Mais verboso e menos elegante, mas equivalente. Útil quando há necessidade de criar classes mais complexas.
        // accept(T t): método abstrato que executa a operação com o argumento fornecido.

        // Lambda inline diretamente no forEach do stream
        // numeros.stream().forEach(n -> {
        //     if (n % 2 == 0) {
        //         System.out.println(n);
        //     }
        // });
        // Lambda passada diretamente no forEach do Stream. Código mais conciso e direto, eliminando a necessidade de declarar um Consumer separado.

        // Lambda inline diretamente no forEach da lista
        // numeros.forEach(n -> {
        //     if (n % 2 == 0) {
        //         System.out.println(n);
        //     }
        // });
        //Dispensou o Stream, aplicando forEach diretamente na List. Mais direto, mas sem as vantagens do pipeline do Stream (como filter, map, etc.).

    }
}

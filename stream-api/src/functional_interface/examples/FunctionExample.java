package functional_interface.examples;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        // Usar a Function com Lambda para dobrar cada número
        Function<Integer, Integer> dobrar = number -> number * 2;

        // Usar a função para dobrar todos os números no Stream e armazenar em uma nova
        // lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
                // .map(dobrar)
                // .toList();
        // Imprimir a lista original e a lista com números dobrados
        numeros.forEach(n -> System.out.println("Número original: " + n));
        numerosDobrados.forEach(n -> System.out.println("Número dobrado: " + n));
    }
}

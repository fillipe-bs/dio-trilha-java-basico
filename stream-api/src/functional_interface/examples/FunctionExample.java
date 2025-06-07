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

        // Usar a função para dobrar todos os números no Stream e armazenar em uma nova lista
        List<Integer> numerosDobrados = numeros.stream()
        
        // --- Alternativa 1: Lambda inline ---
        // Usa uma expressão lambda diretamente dentro do map para dobrar os números.
        // Não utiliza a variável 'dobrar', apenas escreve a lógica no próprio map().
        //         .map(n -> n * 2)
        //         .collect(Collectors.toList());
                
        // --- Alternativa 2: Function + Collectors.toList() ---
        // Usa a função 'dobrar' definida acima, passando-a para o map.
        // Em seguida, usa Collectors.toList() para coletar o resultado em uma nova lista.
                .map(dobrar)
                .collect(Collectors.toList());

        // --- Alternativa 3: Function + toList() (Java 16 ou superior) ---
        // Igual à alternativa 2, mas utiliza o método toList() introduzido no Java 16,
        // que é mais conciso e dispensa o uso de Collectors.
                // .map(dobrar)
                // .toList();

        // Imprimir a lista original e a lista com números dobrados
        numeros.forEach(n -> System.out.println("Número original: " + n));
        numerosDobrados.forEach(n -> System.out.println("Número dobrado: " + n));
    }
}
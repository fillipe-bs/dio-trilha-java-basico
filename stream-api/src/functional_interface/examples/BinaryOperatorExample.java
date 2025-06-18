package functional_interface.examples;

import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    
    // BinaryOperator: Recebe dois valores do mesmo tipo e retorna um valor do mesmo tipo.
    // BinaryOperator<T> nome = (valor1, valor2) -> operação(valor1, valor2);
    // Exemplo: Soma dois números inteiros usando BinaryOperator.

    public static void main(String[] args) {
        

        // Somar dois números inteiros usando BinaryOperator

        // Lista com números inteiros de exemplo
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        // Importar a interface BinaryOperator do pacote java.util.function
        // Declarar uma variável do tipo BinaryOperator que recebe dois inteiros
        // Criar uma expressão lambda que soma os dois inteiros
        BinaryOperator<Integer> soma = (a, b) -> a + b;

        // Usar o método stream() da lista de números para criar um fluxo
        // O método reduce faz uma operação de acumulação sobre os elementos da Stream.
        // Ele recebe dois argumentos:
        // 1º Um valor inicial (neste caso, 0), que será o primeiro "acumulador" (a).
        // 2º Uma função BinaryOperator, que recebe dois argumentos:
        //     - 'a' → acumulador (começa com o valor inicial e depois recebe o resultado parcial).
        //     - 'b' → o próximo elemento da lista.
        int resultado = numeros.stream()
            .reduce(0, soma);
            // O resultado é armazenado na variável resultado

        // Imprimir o resultado da soma na saída padrão
        System.out.println("Resultado da soma: " + resultado);
    }

}

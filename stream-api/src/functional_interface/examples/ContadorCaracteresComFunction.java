package functional_interface.examples;

import java.util.function.Function;

public class ContadorCaracteresComFunction {

    public static void main(String[] args) {
        
        // Declarar uma variável do tipo Function
        // A variável recebe uma expressão lambda que conta os caracteres de uma string
        Function<String, Integer> contarCaracteres =  c -> c.length();
        // Criar uma string de exemplo
        String palavra = "Fillipe";
        // Usar a função contarCaracteres para contar os caracteres da string
        System.out.println(contarCaracteres.apply(palavra));
    }

}

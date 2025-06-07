package functional_interface.examples;

import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GeradorTokenStreamComSupplier {

    public static void main(String[] args) {

        // Gerar tokens únicos para transações usando Supplier e Stream

        // Importar a interface Supplier do pacote java.util.function
        // Declarar uma variável do tipo Supplier
        // A variável recebe uma expressão lambda que gera um UUID
        Supplier<String> tokenSupplier = () -> UUID.randomUUID().toString();

        // Usar o método Stream.generate() para criar um fluxo de tokens
        // O método Stream.generate() recebe o Supplier como argumento
        // O método limit() limita o fluxo a 5 elementos
        // O método forEach() itera sobre cada token gerado e imprime no console
        // A expressão lambda dentro do forEach imprime o token gerado
        Stream.generate(tokenSupplier)
        .limit(5)
        .forEach(token -> System.out.println("Token gerado para transação: " + token));
    }
}

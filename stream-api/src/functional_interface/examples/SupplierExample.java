package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    // Supplier: Fornece um valor sem receber nada como entrada.
    // Supplier<T> nome = () -> gerarValor;
    // Exemplo: Gerar uma lista de saudações usando Supplier.

    public static void main(String[] args) {

        // Importar a interface Supplier do pacote java.util.function
        // Declarar uma variável do tipo Supplier
        // A variável recebe uma expressão lambda que retorna uma saudação
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo";

        // Usar o método Stream.generate() para criar um fluxo de saudações
        // O método Stream.generate() recebe o Supplier como argumento
        // O método limit() limita o fluxo a 5 elementos
        // O método collect() coleta os elementos do fluxo em uma lista
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());
                // Alternativa: Usar o método toList() (disponível a partir do Java 16)
                // .toList();

        // Imprimir as saudações geradas
        // listaSaudacoes.forEach(s -> System.out.println(s));
        listaSaudacoes.forEach(System.out::println);

    }

}

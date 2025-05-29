package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {

        // Usar o Supplier com expressão Lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo";

        // Usar o Supllier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                // .collect(Collectors.toList());
                .toList();

        // Imprimir as saudações geradas
        // listaSaudacoes.forEach(s -> System.out.println(s));
        listaSaudacoes.forEach(System.out::println);

    }

}

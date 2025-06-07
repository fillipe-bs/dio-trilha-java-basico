package functional_interface.examples;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    // Predicate: Recebe um valor e retorna true ou false com base em uma condição (teste lógico).
    // Predicate<T> nome = valor -> condição(valor);
    // Exemplo: Verifica se um número é par usando Predicate.

    public static void main(String[] args) {
        
        // Imprimir nomes com mais de 5 caracteres usando Predicate

        // Lista com nomes de exemplo
        List<String> nomes = List.of("Fillipe", "Kauana", "Malu", "Lilly", "José", "Cecília");

        // Importar a interface Predicate do pacote java.util.function
        // Declarar uma variável do tipo Predicate que recebe uma string
        // Criar uma expressão lambda que verifica se a string tem mais de 5 caracteres
        // A expressão lambda recebe uma string e retorna true se a string tiver mais de 5 caracteres
        Predicate<String> temMaisDeCincoCaracteres = n -> n.length() > 5;

        // Usar o método stream() da lista de nomes para criar um fluxo
        // Filtrar as nomes que atendem à condição do Predicate
        // O método filter() recebe o Predicate como argumento e aplica a condição
        // O método forEach() itera sobre cada elemento do fluxo filtrado e imprime na saída padrão
        nomes.stream()
        .filter(temMaisDeCincoCaracteres)
        // .forEach(System.out::println);
        .forEach(n -> System.out.println("Nome com mais de 5 caracteres: " + n));
    }

}

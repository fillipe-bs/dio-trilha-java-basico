package functional_interface.examples;

import java.util.List;
import java.util.function.Predicate;

public class FiltrarValoresComPredicate {

    public static void main(String[] args) {
        
    // Filtrar valores de uma lista usando Predicate

    // Lista de valores de exemplo
    List<Double> valores = List.of(10.5, 20.0, 15.75, 30.0, 25.5, 5.0);

    // Importar a interface Predicate do pacote java.util.function
    // Declarar uma variável do tipo Predicate que recebe um Double
    // Criar expressões lambda que categorizam os valores em diferentes categorias
    Predicate<Double> Categoria1 = v -> v <= 10.0;
    Predicate<Double> Categoria2 = v -> v <= 20.0 && v > 10.0;
    Predicate<Double> Categoria3 = v -> v > 20.0;

    // Usar o método stream() da lista de valores para criar um fluxo
    // Filtrar os valores que atendem à condição do Predicate
    // O método filter() recebe o Predicate como argumento e aplica a condição
    // O método forEach() itera sobre cada elemento do fluxo filtrado e imprime na saída padrão
    System.out.println("=== Categoria 1 (<= 10.0) ===");
    valores.stream()
    .filter(Categoria1)
    // .forEach(v -> System.out.println(v + " pertence à Categoria 1"));
    // Método forEach com referência de método
    .forEach(System.out::println);

    System.out.println("\n=== Categoria 2 (> 10.0 e <= 20.0) ===");
    valores.stream()
    .filter(Categoria2)
    // .forEach(v -> System.out.println(v + " pertence à Categoria 2"));
    // Método forEach com referência de método
    .forEach(System.out::println);

    System.out.println("\n=== Categoria 3 (> 20.0) ===");
    valores.stream()
    .filter(Categoria3)
    // .forEach(v -> System.out.println(v + " pertence à Categoria 3"));
    // Método forEach com referência de método
    .forEach(System.out::println);
    }
}

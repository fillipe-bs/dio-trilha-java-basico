package functional_interface.examples;

import java.util.function.Consumer;
import java.util.List;

public class TransformarEmMaiusculo {

    public static void main(String[] args) {
        
        // Transformar uma string em maiúsculo usando método Consumer

        // Importar a interface Consumer do pacote java.util.function
        // Declarar uma variável do tipo Consumer que recebe uma string
        // Criar uma expressão lambda que transforma uma string em maiúsculo
        Consumer<String> transformarMaiusculo = s -> System.out.println("Nome transformado: " + s.toUpperCase());
        // Criar uma lista de nomes com o método List.of()
        List<String> nomes = List.of("Kau", "Fill", "Malu", "Lilly");
        // Usar o método forEach da lista de nomes para aplicar a transformação
        // A expressão lambda é passada como argumento para o método forEach
        // O forEach itera sobre cada elemento da lista e aplica a transformação
        // O forEach faz parte da interface Iterable, que é implementada por List
        nomes.forEach(transformarMaiusculo);
        // Imprimir os nomes originais
        nomes.forEach(n -> System.out.println("Nome original: " + n));
    }
}

package functional_interface.examples;

import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GeradorTokenStreamComSupplier {

    public static void main(String[] args) {

        Supplier<String> tokenSupplier = () -> UUID.randomUUID().toString();

        Stream.generate(tokenSupplier)
        .limit(5)
        .forEach(token -> System.out.println("Token gerado para transação: " + token));
    }
}

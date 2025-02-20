public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos primitivos
        byte pequenoNumero = 127;
        short numeroCurto = 32000;
        int numeroInteiro = 2147483647;
        long numeroLongo = 9223372036854775807L;
        float numeroDecimalCurto = 3.14f;
        double numeroDecimalLongo = 3.141592653589793;
        char caractere = 'A';
        boolean verdadeiroOuFalso = true;

        // Tipos de referência
        String texto = "Olá, mundo!";

        // Constantes
        final int MAX_VALOR = 100;
        final double PI = 3.14159;
        final String MENSAGEM = "Constante em Java";

        // Impressão no console
        System.out.println("byte: " + pequenoNumero);
        System.out.println("short: " + numeroCurto);
        System.out.println("int: " + numeroInteiro);
        System.out.println("long: " + numeroLongo);
        System.out.println("float: " + numeroDecimalCurto);
        System.out.println("double: " + numeroDecimalLongo);
        System.out.println("char: " + caractere);
        System.out.println("boolean: " + verdadeiroOuFalso);
        System.out.println("String: " + texto);
        System.out.println("Constante MAX_VALOR: " + MAX_VALOR);
        System.out.println("Constante PI: " + PI);
        System.out.println("Constante MENSAGEM: " + MENSAGEM);
    }
}
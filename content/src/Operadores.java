public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int soma = 10 + 5;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        int divisao = 10 / 5;
        int modulo = 10 % 3;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        
        // Operadores Unários
        int numero = 10;
        System.out.println("Número original: " + numero);
        System.out.println("Incremento: " + (++numero));
        System.out.println("Decremento: " + (--numero));
        System.out.println("Negação: " + (-numero));
        
        // Operadores Relacionais
        System.out.println("10 é maior que 5? " + (10 > 5));
        System.out.println("10 é menor que 5? " + (10 < 5));
        System.out.println("10 é igual a 10? " + (10 == 10));
        System.out.println("10 é diferente de 5? " + (10 != 5));
        
        // Operadores Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        System.out.println("true AND false: " + (condicao1 && condicao2));
        System.out.println("true OR false: " + (condicao1 || condicao2));
        System.out.println("NOT true: " + (!condicao1));
        
        // Operador Ternário
        int idade = 18;
        String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Resultado ternário: " + mensagem);
    }
}
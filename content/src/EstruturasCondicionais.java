public class EstruturasCondicionais {
    public static void main(String[] args) {

        // condicional simples
        System.out.println(" > Output demonstração de Condicional Simples abaixo:");
        double saldo = 10.0;
        double valorSolicitado = 5.0;
        if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
        }
        System.out.println("Saldo atual: R$ " + saldo);

        // condicional composta
        System.out.println(" > Output demonstração de Condicional Composta abaixo:");
        double nota = 3.0;
        double notaCorte = 7.0;
        if (nota >= notaCorte) {
            System.out.println("Aluno aprovado com nota: " + nota);
        } else {
            System.out.println("Aluno reprovado com nota: " + nota);
        }

        // condicional encadeada
        nota = 7;
        System.out.println(" > Output demonstração de Condicional Encadeada abaixo:");
        if (nota > notaCorte) {
            System.out.println("Aluno aprovado com nota acima da Nota de Corte: " + nota);
        }
        else if (nota == notaCorte) {
            System.out.println("Aluno aprovado com nota igual a Nota de Corte: " + nota);
        } else {
            System.out.println("Aluno reprovado com nota abaixo da Nota de Corte: " + nota);
        }
        
        // condição ternária
        System.out.println(" > Output demonstração de Condicional Ternária abaixo:");
        nota = 9.9;
        String resultado = nota >= notaCorte ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        nota = 6.0;
        resultado = nota >= notaCorte ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        // switch case
        System.out.println(" > Output demonstração de Switch Case abaixo:");
        String singlaTamanho = "G"; 

        switch (singlaTamanho) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default: 
                System.out.println("TAMANHO INDEFINIDO");
                break;
        }
    }
    
}

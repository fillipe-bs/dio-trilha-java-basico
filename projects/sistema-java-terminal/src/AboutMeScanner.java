import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //atribuindo valores nas variaveis via objeto scanner (usuário)
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Informe sua idade");
        int idade = scanner.nextInt();

        System.out.println("Informe seu peso");
        double peso = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuário (variaveis)
        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E meu peso é " + peso + " kg");
        
        //encerrando scanner
        scanner.close();
    }
}
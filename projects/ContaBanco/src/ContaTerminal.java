import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        //Solicitando dados ao usuário via terminal
        System.out.println("Olá! Por favor, digite seu nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite o número da agência");
        String agenciaCliente = scanner.next(); 
        
        System.out.println("Digite o número da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o valor do saldo");
        double saldo = scanner.nextDouble();

        //Exibindo dados do usuário
        String menssagem = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agenciaCliente).concat(", conta ").concat(String.valueOf(numeroConta)).concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque."); 

        System.out.println(menssagem);

        scanner.close();
    }
}   

import java.util.Locale;
import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        // for
        for (int num = 1; num <= 7; num++) {
            System.out.println("Dia " + num);
        }
        System.out.println("Semana completa (encerrando loop for)\n");

        // for em arrays
        String diaSemana[] = { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado",
                "Domingo" };
        for (int i = 0; i < diaSemana.length; i++) {
            System.out.println("Dia da semana: " + diaSemana[i]);
        }
        System.out.println("Semana completa (encerrando loop for com array)\n");

        // break e continue
        for (int i = 0; i < diaSemana.length; i++) {
            // if (i > 4) {
            // break;
            // }
            if (i < 5) {
                continue;
            }
            // System.out.println("Dias úteis da semana: " + diaSemana[i]);
            System.out.println("Final de semana: " + diaSemana[i]);
        }
        System.out.println("Semana completa (encerrando loop for com break/continue)\n");

        // while
        int semana = 1;
        while (semana <= 4) {
            System.out.println("Semana: " + semana);
            semana++;
        }
        System.out.println("Mês completo (encerrando loop while)\n");

        // do while
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int userOption;
        do {
            userOption = menu(scanner);
        } while (userOption != 0);  

        scanner.close();
        System.out.println("Você saiu do menu (encerrando loop do while)");
    }
    
    public static int menu(Scanner scanner) {
        System.out.println("Escolha uma das opções:\n1 para continuar\n0 para sair");
        int choice = scanner.nextInt();
        return choice;
    }
}


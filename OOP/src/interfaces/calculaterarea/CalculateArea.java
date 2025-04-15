package interfaces.calculaterarea;

import java.util.Scanner;

public class CalculateArea {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;

        while (option != 0) {
            System.out.println("\n>>>> CALCULAR ÁREA <<<<");
            System.out.println("DIGITE A OPÇÃO DESEJADA");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    calculateSquare();
                    break;
                case 2:
                    calculateRectangle();
                    ;
                    break;
                case 3:
                    calculateCircle();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.err.println("Digite um valor válido");
            }
        }
    }

    // Método PRIVATE: só pode ser acessado dentro da própria classe
    // Responsável por ler o lado do quadrado, instanciar a forma e exibir a área
    private static void calculateSquare() {
        System.out.println("Infome o lado do quadrado:");
        double side = scanner.nextDouble();
        // GeometricForm é a INTERFACE usada como tipo de referência
        // Polimorfismo: instância de Square atribuída à interface
        GeometricForm square = new Square(side);  
        // Chamada do método implementado na classe Square
        double area = square.getArea(); 
        System.out.println("A área do quadrado é: " + area);
    }

    private static void calculateRectangle() {
        System.out.println("Informe a altura do retângulo:");
        double height = scanner.nextDouble();
        System.out.println("Informe a largura do retângulo:");
        double width = scanner.nextDouble();
        // GeometricForm é a INTERFACE usada como tipo de referência
        // Polimorfismo: instância de Rectangle atribuída à interface
        GeometricForm rectangle = new Rectangle(height, width);
        double area = rectangle.getArea();
        System.out.println("A área do retângulo é: " + area);
    }

    private static void calculateCircle() {
        System.out.println("Informe o raio do círculo: ");
        double radius = scanner.nextDouble();
        // GeometricForm é a INTERFACE usada como tipo de referência
        // Polimorfismo: instância de Circle atribuída à interface
        GeometricForm circle = new Circle(radius);
        double area = circle.getArea();
        System.out.println("A área do círculo é: " + area);
    }

}
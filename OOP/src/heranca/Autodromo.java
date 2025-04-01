package heranca;

public class Autodromo {
    public static void main(String[] args) {
        Carro bmw = new Carro();
        bmw.setChassi("123456");
        bmw.ligar();

        Moto honda = new Moto();
        honda.setChassi("654321");
    }
}

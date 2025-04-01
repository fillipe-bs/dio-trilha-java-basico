package abstracaoepolimorfismo;

public class Autodromo {
    public static void main(String[] args) {
        Carro bmw = new Carro();
        bmw.setChassi("123456");
        // bmw.ligar();

        Moto honda = new Moto();
        honda.setChassi("654321");
        // honda.ligar();

        
        // Polimorfismo: objeto do tipo Veiculo apontando para uma Moto
        Veiculo coringa = honda;
        coringa.ligar();
        
        // Outro exemplo de polimorfismo
        coringa = bmw;
        coringa.ligar();
    }
}
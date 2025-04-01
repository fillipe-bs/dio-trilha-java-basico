package encapsulamento;

public class Carro {
    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("LIGANDO CARRO");
    }

    private void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }
    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO");
    }
    

}

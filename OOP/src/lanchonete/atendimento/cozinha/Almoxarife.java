package lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada(){
        System.out.println("ALMOXARIFE CONTROLANDO A ENTRADA");
    }
    private void controlarSaida(){
        System.out.println("ALMOXARIFE CONTROLANDO A SAIDA");
        controlarSaida();
    }

    void trocarGas(){
        System.out.println("ALMOXARIFE TROCANDO GÁS");
    }
    void entregarIngredientes(){
        System.out.println("ALMOXARIFE ENTREGANDO INGREDIENTES");
    }

}

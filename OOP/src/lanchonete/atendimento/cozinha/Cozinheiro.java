package lanchonete.atendimento.cozinha;

public class Cozinheiro {

    private void prepararLanche(){
        System.out.println("COZINHEIRO PREPARANDO LANCHE");
    }
    private void prepararSuco(){
        System.out.println("COZINHEIRO PREPARANDO SUCO");
    }

    public void adicionarLancheNoBalcao(){
        System.out.println("COZINHEIRO ADICIONANDO LANCHE NO BALCÃO");
    } 
    public void adicionarSucoNoBalcao(){
        System.out.println("COZINHEIRO ADICIONANDO SUCO NO BALCÃO");
    } 

    private void solicitarTrocarGas (Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

}

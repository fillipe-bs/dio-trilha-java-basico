package lanchonete.atendimento;

public class Atendente {

   
    public void anotarPedido(){
        System.out.println("ATENDENTE ANOTANDO PEDIDO");
    }
    private void pegarLancheCozinha(){
        System.out.println("ATENDENTE PEGANDO O LANCHE NA COZINHA");
    }
    public void servirMesa(){
        System.out.println("ATENDENTE SERVINDO MESA");
    }
    public void limparMesa(){
        System.out.println("ATENDENTE LIMPANDO MESA");
    }
    public void receberPagamento(){
        System.out.println("ATENDENTE RECEBENDO PAGAMENTO");
    }

    void trocarGas (){
        System.out.println("ATENDENTE TROCANDO GÁS");
    }

}

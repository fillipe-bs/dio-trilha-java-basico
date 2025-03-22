package lanchonete.area.cliente;

public class Cliente {

    public void escolherLanche(){
        System.out.println("CLIENTE ESCOLHENDO LANCHE");
    }
    public void fazerPedido(){
        System.out.println("CLIENTE FAZENDO PEDIDO");
    }

    private void consultarSaldoApp(){
        System.out.println("CLIENTE CONSULTANDO SALDO NO APP");
    }
    public void realizarPagamento(){
        consultarSaldoApp();
        System.out.println("CLIENTE REALIZANDO PAGAMENTO");
    }

}

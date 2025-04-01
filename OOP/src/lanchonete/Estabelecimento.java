package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
// import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();
        //MÉTODOS QUE NÃO DEVEM SER PÚBLICOS
        // cozinheiro.prepararLanche();
        // cozinheiro.prepararSuco();
        
        //MÉTODOS QUE SÃO PÚBLICOS
        // cozinheiro.adicionarLancheNoBalcao();
        // cozinheiro.adicionarSucoNoBalcao();
        
        // Almoxarife almoxarife = new Almoxarife();
        //MÉTODOS QUE NÃO DEVEM SER PÚBLICOS
        // almoxarife.controlarEntrada();
        // almoxarife.controlarSaida();

        //MÉTODOS QUE SOMENTE A COZINHA PRECISA TER ACESSO
        // almoxarife.entregarIngredientes();
        // almoxarife.trocarGas();
        
        Atendente atendente = new Atendente();
        //MÉTODOS QUE NÃO DEVEM SER PÚBLICOS
        // atendente.pegarLancheCozinha();

        //MÉTODOS QUE SÃO PÚBLICOS
        // atendente.anotarPedido();
        // atendente.servirMesa();
        // atendente.limparMesa();
        // atendente.receberPagamento();

        Cliente cliente = new Cliente();
        //MÉTODOS QUE NÃO DEVEM SER PÚBLICOS
        // cliente.consultarSaldoApp();
        // cliente.consultarSaldoApp();

        //MÉTODOS QUE SÃO PÚBLICOS
        // cliente.escolherLanche();
        // cliente.fazerPedido();
        // cliente.realizarPagamento();

        // ATENDIMENTO
        cliente.escolherLanche();
        cliente.fazerPedido();
        atendente.anotarPedido();
        cozinheiro.adicionarLancheNoBalcao();
        atendente.servirMesa();
        cliente.realizarPagamento();
        atendente.limparMesa();
        
    }
}

public class Banco {
    
    public static void main(String[] args) {
        
        Cliente fillipe = new Cliente();
        fillipe.setNome("Fillipe");
        IConta cc = new ContaCorrente(fillipe);
        IConta cp = new ContaPoupanca(fillipe);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(2000);
        cp.depositar(1000);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(500, cp);
        cc.sacar(500);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("\n\n=== Lista de todas as contas criadas===");
        for (IConta c : Conta.getContas()) {
            ((Conta) c).imprimirInfosComunsList();
        }
        
    }
}

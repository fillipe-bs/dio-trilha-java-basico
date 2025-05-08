package main.java.set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Fillipe", 997);
        conjuntoConvidados.adicionarConvidado("Kauana", 998);
        conjuntoConvidados.adicionarConvidado("Leonardo", 999);
        conjuntoConvidados.adicionarConvidado("Mariana", 1000);
        conjuntoConvidados.adicionarConvidado("Ricardo", 1001);
        conjuntoConvidados.adicionarConvidado("Lais", 1002);

        System.out.println("O número de convidados é: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(998);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1000);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1002);
        
        System.out.println("O número de convidados é: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
        
        conjuntoConvidados.adicionarConvidado("Lily", 1003);
        conjuntoConvidados.adicionarConvidado("Tininha", 1001);
        
        System.out.println("O número de convidados é: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

    }
        
}

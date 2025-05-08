package main.java.set.Search;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public int contarContatos(){
        return contatoSet.size();
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
                break;
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                System.out.println("O número do contato " + nome + " foi atualizado");
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Fillipe BS", 999999999);
        agendaContatos.adicionarContato("Fillipe BS", 999999999);
        agendaContatos.adicionarContato("Fillipe Soranso", 999999999);
        agendaContatos.adicionarContato("Kauana CP", 999999999);
        agendaContatos.adicionarContato("Kauana CP", 999999999);
        agendaContatos.adicionarContato("Kauana Pisante", 999999999);
        agendaContatos.exibirContatos();
        System.out.println("O número de contatos salvos com nomes distintos é: " + agendaContatos.contarContatos());
        System.out.println("O contato pesquisado é: " + agendaContatos.pesquisarPorNome("Fillipe"));
        
        agendaContatos.atualizarNumeroContato("Fillipe", 888888888);
        agendaContatos.exibirContatos();
        System.out.println("O contato pesquisado é: " + agendaContatos.pesquisarPorNome("Fillipe"));
    }

}

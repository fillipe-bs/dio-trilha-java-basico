package main.java.map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroTelefonePorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroTelefonePorNome = agendaContatoMap.get(nome);
        }
        return numeroTelefonePorNome;
    }

    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Kauana", 999999999);
        agendaContatos.adicionarContato("Aranym", 888888888);
        agendaContatos.adicionarContato("Sr Julio", 777777777);
        agendaContatos.adicionarContato("Sra Ana", 666666666);
        agendaContatos.adicionarContato("Malu", 555555555);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Malu");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Sr Julio"));
    }
}

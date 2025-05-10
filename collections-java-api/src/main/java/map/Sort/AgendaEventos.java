package main.java.map.Sort;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        if (eventoTreeMap.isEmpty()) {
            System.out.println("Sem eventos agendados.");
        } else {
            System.out.println(eventoTreeMap);
        }
    }

    public void obterProximoEvento() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.exibirAgenda();
        agendaEventos.adicionarEvento(LocalDate.of(2025, 05, 10), "Jogo", "Time 'A' vs Time 'B'");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 05, 9), "Show", "AC/DC");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 05, 11), "Exposição", "Troféus");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

}

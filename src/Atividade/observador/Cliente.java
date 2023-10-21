package Atividade.observador;

import java.util.ArrayList;
import java.util.List;

// Observador Concreto
public class Cliente implements Observador {
    private String nome;
    private List<String> interesses = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarInteresse(String interesse) {
        interesses.add(interesse);
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu notificação: " + mensagem);
    }
}


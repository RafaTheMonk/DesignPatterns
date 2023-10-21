package Atividade.concessionaria;

import java.util.ArrayList;
import java.util.List;
import Atividade.carro.Carro;
import Atividade.observador.Observador;

public class Concessionaria {
    private List<Observador> clientes = new ArrayList<>();
    private List<Carro> carros = new ArrayList<>();

    public void adicionarCliente(Observador cliente) {
        clientes.add(cliente);
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
        notificarClientes("Novo carro disponível: " + carro.modelo + ", Preço: R$" + carro.preco + ", Cor: " + carro.cor);
    }

    public void notificarClientes(String mensagem) {
        for (Observador cliente : clientes) {
            for (Carro carro : carros) {
                if (mensagem.contains(carro.modelo) || mensagem.contains(String.valueOf(carro.preco)) || mensagem.contains(carro.cor)) {
                    cliente.atualizar(mensagem);
                }
            }
        }
    }
}

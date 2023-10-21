package Atividade;

import Atividade.carro.Carro;
import Atividade.concessionaria.Concessionaria;
import Atividade.concessionaria.FabricaDeCarros;
import Atividade.observador.Cliente;

public class Main {
    public static void main(String[] args) {
        FabricaDeCarros fabricaDeCarros = new FabricaDeCarros();
        Concessionaria concessionaria = new Concessionaria();

        Cliente cliente1 = new Cliente("Cliente 1");
        cliente1.adicionarInteresse("Vermelho");
        cliente1.adicionarInteresse("15000");

        Cliente cliente2 = new Cliente("Cliente 2");
        cliente2.adicionarInteresse("Azul");
        cliente2.adicionarInteresse("Película");

        concessionaria.adicionarCliente(cliente1);
        concessionaria.adicionarCliente(cliente2);

        Carro carro1 = fabricaDeCarros.criarCarro("Celta", "Celta 2023", 15000, "Azul");
        Carro carro2 = fabricaDeCarros.criarCarro("Ka", "Ka 2023", 18000, "Azul");
        Carro carro3 = fabricaDeCarros.criarCarro("BMW", "BMW 2023", 45000, "Preto");

        carro1.adicionarAcessorio("Teto Solar");
        carro2.adicionarAcessorio("Película");
        carro2.adicionarAcessorio("GPS");

        concessionaria.adicionarCarro(carro1);
        concessionaria.adicionarCarro(carro2);
        concessionaria.adicionarCarro(carro3);
    }
}

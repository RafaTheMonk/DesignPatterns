package Atividade.concessionaria;

import Atividade.carro.BMW;
import Atividade.carro.Celta;
import Atividade.carro.Ka;
import Atividade.carro.Carro;
public class FabricaDeCarros {
    private final Carro prototipoCelta;
    private final Carro prototipoKa;
    private final Carro prototipoBMW;

    public FabricaDeCarros() {
        prototipoCelta = new Celta();
        prototipoKa = new Ka();
        prototipoBMW = new BMW();
    }

    public Carro criarCarro(String modeloCarro, String modelo, double preco, String cor) {
        Carro prototipo;
        if ("Celta".equals(modeloCarro)) {
            prototipo = prototipoCelta.clone();
        } else if ("Ka".equals(modeloCarro)) {
            prototipo = prototipoKa.clone();
        } else if ("BMW".equals(modeloCarro)) {
            prototipo = prototipoBMW.clone();
        } else {
            throw new IllegalArgumentException("Modelo de carro inválido: " + modeloCarro);
        }

        prototipo.modelo = modelo;
        prototipo.preco = preco;
        prototipo.cor = cor;
        return prototipo;
    }
}

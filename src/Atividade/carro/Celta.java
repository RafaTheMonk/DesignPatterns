package Atividade.carro;

public class Celta extends Carro {
    public Celta() {
        this.modelo = "Celta";
    }

    @Override
    public Carro clone() {
        Celta celta = new Celta();
        celta.preco = this.preco;
        celta.cor = this.cor;
        celta.acessorios.addAll(this.acessorios);
        return celta;
    }
}
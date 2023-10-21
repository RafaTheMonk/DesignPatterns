package Atividade.carro;

public class BMW extends Carro {
    public BMW() {
        this.modelo = "BMW";
    }

    @Override
    public Carro clone() {
        BMW bmw = new BMW();
        bmw.preco = this.preco;
        bmw.cor = this.cor;
        bmw.acessorios.addAll(this.acessorios);
        return bmw;
    }
}
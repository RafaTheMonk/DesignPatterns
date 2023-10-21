package Atividade.carro;

public class Ka extends Carro {
    public Ka() {
        this.modelo = "Ka";
    }

    @Override
    public Carro clone() {
        Ka ka = new Ka();
        ka.preco = this.preco;
        ka.cor = this.cor;
        ka.acessorios.addAll(this.acessorios);
        return ka;
    }
}

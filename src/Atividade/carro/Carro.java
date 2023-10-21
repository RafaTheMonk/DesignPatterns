package Atividade.carro;
import java.util.ArrayList;
import java.util.List;

// Carro (Prototype)
public abstract class Carro implements Cloneable {
    public String modelo;
    public double preco;
    public String cor;
    protected List<String> acessorios = new ArrayList<>();

    public abstract Carro clone();

    public void adicionarAcessorio(String acessorio) {
        acessorios.add(acessorio);
    }

    public void mostrarInformacoes() {
        System.out.println("Modelo: " + modelo + ", Preço: R$" + preco + ", Cor: " + cor);
        System.out.println("Acessórios: " + String.join(", ", acessorios));
    }
}

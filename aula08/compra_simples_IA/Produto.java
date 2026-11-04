package aula08.compra_simples_IA;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double obterPreco() {
        return preco;
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome);
    }
}
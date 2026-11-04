package aula08.compra_simples_IA;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Cliente: " + nome);
    }
} 
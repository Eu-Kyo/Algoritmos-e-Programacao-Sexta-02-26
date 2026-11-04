package aula08.compra_simples_IA;

public class Compra {
    private int quantidade;
    private double precoUnitario;

    public Compra(int quantidade, double precoUnitario) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularTotal() {
        return quantidade * precoUnitario;
    }

    public void exibirResumo() {
        double total = calcularTotal();
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: R$ " + total);
    }
}
package aula08.compra_simples_IA;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana");
        Produto produto = new Produto("Suco", 4.0);
        int quantidade = 2;

        double preco = produto.obterPreco();
        Compra compra = new Compra(quantidade, preco);

        cliente.exibirDados();
        produto.exibirDados();
        compra.exibirResumo();
    }
}
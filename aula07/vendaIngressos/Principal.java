package aula07.vendaIngressos;

public class Principal {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        ingresso.evento = "Feira de Ciências";
        ingresso.precoUnit = 20;
        Compra compra = new Compra();
        compra.ingresso = ingresso;
        compra.qtd = 3;
        compra.mostrarResumo();
        
    }
}

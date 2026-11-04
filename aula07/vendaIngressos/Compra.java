package aula07.vendaIngressos;

public class Compra {
    Ingresso ingresso;
    int qtd;
    int calcTotal(){
        return ingresso.precoUnit * qtd;
    };
    void mostrarResumo(){
        System.out.println("* Evento: " + ingresso.evento);
        System.out.println("* Preço unitário:  R$" + ingresso.precoUnit);
        System.out.println("* Quantidade: " + qtd);
        System.out.println("* Total: R$" + calcTotal()); 
    }
}

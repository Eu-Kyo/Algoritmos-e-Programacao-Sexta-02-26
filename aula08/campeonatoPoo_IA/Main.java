package aula08.campeonatoPoo_IA;

public class Main {

    public static void main(String[] args) {
        Jogador ana = new Jogador("Ana", 10);
        Jogador bruno = new Jogador("Bruno", 9);

        ana.marcarGol();
        bruno.marcarGol();
        bruno.marcarGol();
        
        System.out.println("Nome: " + ana.getNome());
        System.out.println("Numero: " + ana.getNumero());
        System.out.println("Gols: " + ana.getGols());
        System.out.println();
        System.out.println("Nome: " + bruno.getNome());
        System.out.println("Numero: " + bruno.getNumero());
        System.out.println("Gols: " + bruno.getGols());
        System.out.println();

        Time azul = new Time("Azul");
        Time verde = new Time("Verde");

        Partida partida = new Partida(azul, verde);
        partida.encerrar(2, 1);
        partida.exibirResultado();

        System.out.println(azul.getNome() + ": " + azul.getPontos() + " pontos");
        System.out.println(verde.getNome() + ": " + verde.getPontos() + " pontos");
    }
}
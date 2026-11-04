package aula08.campeonatoPoo_IA;

public class Jogador {

    private String nome;
    private int numero;
    private int gols;

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.gols = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getGols() {
        return gols;
    }

    public void marcarGol() {
        gols = gols + 1;
    }
}
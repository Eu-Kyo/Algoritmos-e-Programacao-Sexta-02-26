package aula08.campeonatoPoo_IA;

public class Time {

    private String nome;
    private int pontos;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void registrarVitoria() {
        pontos = pontos + 3;
    }

    public void registrarEmpate() {
        pontos = pontos + 1;
    }
}
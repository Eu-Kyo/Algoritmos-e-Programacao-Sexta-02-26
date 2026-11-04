package aula08.campeonatoPoo_IA;

public class Partida {

    private Time mandante;
    private Time visitante;
    private int golsMandante;
    private int golsVisitante;
    private boolean encerrada;

    public Partida(Time mandante, Time visitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.golsMandante = 0;
        this.golsVisitante = 0;
        this.encerrada = false;
    }

    public void encerrar(int golsMandante, int golsVisitante) {
        if (encerrada) {
            System.out.println("Erro: a partida ja foi encerrada.");
            return;
        }

        if (golsMandante < 0 || golsVisitante < 0) {
            System.out.println("Erro: o placar nao pode ter gols negativos.");
            return;
        }

        this.golsMandante = golsMandante;
        this.golsVisitante = golsVisitante;

        if (golsMandante > golsVisitante) {
            mandante.registrarVitoria();
        } else if (golsVisitante > golsMandante) {
            visitante.registrarVitoria();
        } else {
            mandante.registrarEmpate();
            visitante.registrarEmpate();
        }

        encerrada = true;
    }

    public void exibirResultado() {
        if (encerrada) {
            System.out.println(mandante.getNome() + " " + golsMandante
                    + " x " + golsVisitante + " " + visitante.getNome());
        } else {
            System.out.println("A partida ainda nao foi encerrada.");
        }
    }
}
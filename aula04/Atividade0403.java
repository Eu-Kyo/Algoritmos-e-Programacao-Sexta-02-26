package aula04;

// Exercício 3 – Soma por linha e decisão final

public class Atividade0403 {
    public static void main(String[] args) {
        int somaLinha, maiorSoma = -1, linhaMaior = 0, i, j;
        int [][] M = {
            {4, 1, 3},
            {2, 5, 6},
            {7, 0, 2}
        };
        System.out.println("> TESTE DE MESA: ");
        System.out.println("  i  |  j  |  linhaMaior  |  maiorSoma  ");
        for(i=0; i<3; i++){
            somaLinha = 0;
            for(j=0; j<3; j++){
                somaLinha = somaLinha + M[i][j];
            }
            if (somaLinha>maiorSoma) {
                maiorSoma = somaLinha;
                linhaMaior = i;
            }
            System.out.format(">  %d,   %d,       %d,           %d   \n", i, j, linhaMaior, maiorSoma);
        }
        System.out.println("Linha: " + linhaMaior);
        System.out.println("Maior soma: "+ maiorSoma);

    }
}

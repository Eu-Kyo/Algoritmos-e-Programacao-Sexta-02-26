package aula04;

// Exercício 2 – Seleção de elementos da matriz

public class Atividade0402 {
    public static void main(String[] args) {
        int i, j, qntd = 0, somaPares = 0;
        int [][] M = {
            {2, 7, 4},
            {5, 8, 4},
            {6, 1, 9}
        };
        System.out.println("> TESTE DE MESA: ");
        System.out.println("  i | j | qntd | somaPar");
        for(i=0; i<3; i++){
            for(j=0;j<3;j++){
                if (M[i][j] % 2 == 0) {
                    qntd = qntd +1;
                    somaPares = somaPares + M[i][j];
                    
                }
                //System.out.println("> " + i + ",  "+ j + ",    " + qntd + ",    " + somaPares);
                System.out.format("> %d,  %d,   %d,    %d\n", i, j, qntd, somaPares);
            }
        }

        System.out.println("> Quantidade: " + qntd);
        System.out.println("> Soma dos pares: " + somaPares);
    }
}

package aula04;

// Exercício 1 – Percurso e soma dos elementos 

public class Atividade0401 {
    public static void main(String[] args) {
        // int[][] M = new int[3][3];
        int i, j, soma = 0;
        int[][] M = {
            {2, 4, 1}, 
            {3, 5, 6}
        };
        System.out.println("> TESTE DE MESA: ");
        System.out.println("  i | j | Soma");
        for(i = 0; i < 2; i++){
            for(j = 0; j< 3; j++){
                soma = (soma + M[i][j]);
                System.out.println("> " + i + ", "+ j + " = " + soma);
            }
        }

        System.out.println("> Soma: " + soma);
    }
}

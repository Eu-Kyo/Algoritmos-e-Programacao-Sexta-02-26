package aula03;

public class Exercicio0301 {
    public void main(String[]args){
        int v[] = {4, 7, 2, 9, 6, 3};
        int i, soma = 0, qntd = 0;
        
        for (i = 0; i < 6; i++){
            if (v[i]%2 == 0){
                soma = soma + v[i];
                qntd = qntd +1;
            }
        }

        System.out.println("Soma dos números pares: "+ soma);
        System.out.println("Quantidade de números:" + qntd);
    }
}

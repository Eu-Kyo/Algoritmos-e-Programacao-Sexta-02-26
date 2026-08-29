package algoritimos.sexta.usjt.pkg02.pkg26;
import java.util.Scanner;
public class AlgoritimosSextaUSJT0226 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int teste, somaPos = 0 , qntdNeg = 0, qntdPar = 0, qntdImpar = 0, qntdZero = 0;
        
        for (teste = 1; teste <=6; teste++)
        {
            System.out.println("----- Teste "+teste+" -----"); //deve ter um jeito mais bonitinho
            System.out.print("Digite um numero: ");
            int num = entrada.nextInt();
            
            if(num > 0)
            {
                somaPos = somaPos + num;
                if(num % 2 == 0)
                {
                    qntdPar++;
                }
                else{
                    qntdImpar++;
                }
            }
            else    
            {
                if(num < 0)
                {
                    qntdNeg++;
                }
                else
                {
                    qntdZero++;
                }
            }
        }
        System.out.println("Numeros positivos pares: "+ qntdPar);
        System.out.println("Numeros positivos impares: "+ qntdImpar);
        System.out.println("Numeros negativos: "+ qntdNeg);
        System.out.println("Quantidade de zeros: "+ qntdZero);
        System.out.println("Soma dos numeros positivos: "+   somaPos);
                
    }
    
}

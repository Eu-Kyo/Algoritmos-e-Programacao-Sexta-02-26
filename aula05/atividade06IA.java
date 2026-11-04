package aula05;

import java.util.Scanner;

public class atividade06IA {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        // Matriz Q (3x3): Linhas (i) = Lojas (0 a 2), Colunas (j) = Produtos (0 a 2) 
        int[][] Q = new int[3][3]; 
        // Vetor P (3 elementos): Preço unitário dos produtos (índice j) 
        double[] P = new double[6]; 
        // Vetor R (3 elementos): Receita acumulada por loja (índice i) 
        double[] R = new double[6]; 
        //  1\. Leitura das quantidades vendidas (Matriz Q) 
        System.out.println("--- Leitura da Matriz Q (Quantidade de Produtos por Loja) ---"); 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print("Digite a quantidade do Produto " + (j + 1) + " vendido pela Loja " + (i + 1) + ": "); 
                Q[i][j] = scanner.nextInt(); 
            } 
        } 
            
        // 2\. Leitura dos preços no vetor P 
        System.out.println("\n--- Leitura do Vetor P (Preço dos Produtos) ---");
        for (int j = 0; j < 3; j++) { 
            System.out.print("Digite o preço unitário do Produto " + (j + 1) + ": "); 
            P[j] = scanner.nextDouble(); 
        } 
            
            // 3\. Cálculo da receita de cada loja (Vetor R) usando laços aninhados 
        for (int i = 0; i < 3; i++) { 
            // ========================================================================= 
            // PONTO DE INICIALIZAÇÃO DA RECEITA:
            // A receita da loja 'i' (R[i]) é ZERADA/INICIALIZADA AQUI, no início do 
            // laço externo (percorrendo cada loja 'i'), antes de somar as vendas dos produtos. 
            // ========================================================================= 
            R[i] = 0.0; 
            for (int j = 0; j < 3; j++) { // Acumula o produto entre a quantidade vendida da loja 'i' (Q[i][j]) e o preço do produto 'j' (P[j]) 
                R[i] += Q[i][j] * P[j]; 
            } 
        } 
        
        // 4\. Identificação da loja com maior receita 
        int lojaMaior = 0; // Começa considerando a Loja 1 (índice 0 em Java) como campeã temporária 
        double maiorReceita = R[0]; 
        for (int i = 1; i < 3; i++) { 
            // O operador estritamente maior (<) garante o desempate pelo menor índice: 
            // Se R[i] for igual a maiorReceita, a condição é FALSA e a loja de menor índice é mantida. 
            if (R[i] > maiorReceita) { 
                maiorReceita = R[i]; lojaMaior = i; 
            } 
        } 
        // 5\. Exibição dos resultados 
        System.out.println("\n--- RESULTADOS DA RECEITA POR LOJA ---"); 
        for (int i = 0; i < 3; i++) { 
            System.out.println("Receita da Loja " + (i + 1) + ": R$ " + R[i]); 
        } 
        
        System.out.println("\nA loja que obteve a MAIOR receita foi a LOJA " + (lojaMaior + 1) + " com R$ " + maiorReceita); 
        scanner.close(); 
    } 
}


package com.mycompany.lista01.vitor;

import java.util.Scanner;

public class exBolsaFilhos {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        
        Double resultado_0_3 = null;
        Double resultado_4_16 = null;
        Double resultado_17_18 = null;
        
        System.out.println("Quantos filhos de 0 até 3 anos você tem? ");
        Integer filho_0_ate_3 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 até 16 anos você tem? ");
        Integer filho_4_ate_16 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 até 18 anos você tem? ");
        Integer filho_17_ate_18 = leitor.nextInt();
        
        if(filho_0_ate_3 < 0)
        {
            resultado_0_3 = filho_0_ate_3 * 25.12;
            
        }
        
        if(filho_4_ate_16 < 0)
        {
            resultado_4_16 = filho_4_ate_16 * 15.88;
        }
        
        if(filho_17_ate_18 < 0)
        {
            resultado_17_18 = filho_17_ate_18 * 12.44;
        }
        
        Integer filho_total = filho_0_ate_3 + filho_4_ate_16 + filho_17_ate_18;
        
        Double tentativa = resultado_0_3 + resultado_4_16 + resultado_17_18;
        
        String frase = String.format("Você tem um total de %d filhos e vai receber"
                + "R$ %.2f", filho_total, tentativa);
        
        System.out.println(frase);
    }
    

}

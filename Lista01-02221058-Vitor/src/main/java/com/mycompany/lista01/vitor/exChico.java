
package com.mycompany.lista01.vitor;

import java.util.Scanner;

public class exChico {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        Integer aquecimento = null;
        Integer aerobico = null;
        Integer musculacao = null;
        
        System.out.println("Quanto tempo (em minutos) você se aqueceu?");
        aquecimento = leitor.nextInt();
        
        System.out.println("Quanto tempo (em minutos) você fez exercicios "
                + "aerobicos?");
        aerobico = leitor.nextInt();
        
        System.out.println("Quanto tempo (em minutos) você fez musculação?");
        musculacao = leitor.nextInt();

        Integer total_aquecimento = aquecimento * 12;
        Integer total_aerobico = aerobico * 20;
        Integer total_musculacao = musculacao * 25;
        
        Integer total_min = aquecimento + aerobico +  musculacao;
        
        Integer total_caloria = total_aquecimento + total_aerobico + total_musculacao;
        
        System.out.println("Olá, Jorge. Você fez um total de " + total_min
        + " minutos de exercicios e perdeu cerca de " + total_caloria + " calorias");
        
    }
          
        
    
}

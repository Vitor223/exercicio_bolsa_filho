package com.mycompany.lista01.vitor;

import java.util.Scanner;

public class exCalculadora {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Double num_1 = null;
        Double num_2 = null;
        Double soma = null;
        Double subtr = null;
        Double muit = null;
        Double div = null;
        
        System.out.println("Calculadora");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Digite um número: ");
        num_1 = leitor.nextDouble();
        
        System.out.println("Digite um segundo número: ");
        num_2 = leitor.nextDouble();
    }
    
    
}

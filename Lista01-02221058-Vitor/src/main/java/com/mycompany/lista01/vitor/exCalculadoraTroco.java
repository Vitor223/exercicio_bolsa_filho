package com.mycompany.lista01.vitor;

import java.util.Scanner;

public class exCalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        Double valor_prod = null;
        Double qtd_vendida = null;
        Double valor_pag = null;
        
        
        System.out.println("Calculadora de Troco");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Digite a quantidade que você comprou desse produto: ");
        qtd_vendida = leitor.nextDouble();
        
        System.out.println("Digite o valor desse produto (unitario): ");
        valor_prod = leitor.nextDouble();
        
        System.out.println("Digite o quanto você Pagou ao caixa: ");
        valor_pag = leitor.nextDouble();
        
        Double total_pagar = valor_prod * qtd_vendida;
        
        Double troco = valor_pag - total_pagar;
        
        if(troco == 0){
            System.out.println("Você não irá receber troco");
        }
        
        else if(troco > 0){
            String frase = String.format("Seu troco foi de R$%.2f", troco);
        System.out.println(frase);
        }
        
        else
        {
            System.out.println("Seu dinheiro é insuficiente");
        }
            
    }
    
}

package com.mycompany.lista01.vitor;

import java.util.Scanner;

public class exCadastroUsuario {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite Seu Login: ");
        String login = leitor.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senha = leitor.nextLine();
        
        System.out.println("Quantas tentativas você "
                + "quer ter antes do bloqueio?");
        
        Integer tentativas = leitor.nextInt();
        
        String frase = String.format("Login %s \nSenha %s \nVocê terá %d tentativas",
                login,senha,tentativas);
        
        System.out.println(frase);
        
    }
    
}

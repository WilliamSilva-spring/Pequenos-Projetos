/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exe10;

import java.util.Scanner;


public class Menu_de_Opcoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int opcao, numero1 , numero2, soma, quadrado;
        
        System.out.println("Menu de opções:");
        System.out.println("1. Somar dois números.");
        System.out.println("2. Número ao quadrado.");
        
        System.out.println("Qual a opcão: ");
        opcao = s.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Informe o valor do primeiro número: ");
                numero1 = s.nextInt();
                System.out.println("Informe o valor do segundo número:");
                numero2 = s.nextInt();
                soma = numero1 + numero2;
                System.out.println("Resultado: "+soma);
            case 2:
                System.out.println("Informe o valor: ");
                quadrado = s.nextInt();
                System.out.println("Valor ao quadrado: "+Math.sqrt(quadrado));
                
        }
       
    }
    
}

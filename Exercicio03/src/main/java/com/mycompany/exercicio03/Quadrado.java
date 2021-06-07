
package com.mycompany.exercicio03;

import java.util.Scanner;


public class Quadrado {

    
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int quadrado = 0;
        
        
        
        
        
        
        
        
        
        while(quadrado >= 0){
            System.out.println("Informe o valor: ");
            quadrado = sc.nextInt();
            if(quadrado >= 0){
                System.out.println("Seu quadrado é: "+quadrado * quadrado);
            }else if(quadrado < 0){
                System.out.println("Você digitou um número invalido.");
            }
        }
            
            
            
        
         
        
    }
    
}

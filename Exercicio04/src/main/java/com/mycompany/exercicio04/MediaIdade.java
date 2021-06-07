
package com.mycompany.exercicio04;

import java.util.Scanner;

public class MediaIdade {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade = 0;
        double mediaIdade;
        
        int contagem = 0;
        int soma = 0;
        
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();
        soma = soma + idade;
        contagem = contagem +1;
        
        while(idade > 0){
            System.out.println("Informe sua idade: ");
            idade = sc.nextInt();
            soma = soma + idade;
            contagem = contagem +1;
            
        }if (contagem > 0){
            mediaIdade = soma / (contagem - 1);
            System.out.println(mediaIdade);
        }
         
        
        
        
        
        
        
    }
    
}


package com.mycompany.exercicio01;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valores = 0;
        int soma = 0;
        
        
        System.out.println("Digite os valores: ");
        for(int i = 0; i < 10; i++){
            valores = scan.nextInt();
            soma = soma + valores;
            
            
        }if(soma != 0){
            System.out.println("Resultado final: "+soma);
        }else{
            System.out.println("Não há valores a serem calculados.");
        }
        
        
        
        
      
        
        
      
        
        
    }
    
}

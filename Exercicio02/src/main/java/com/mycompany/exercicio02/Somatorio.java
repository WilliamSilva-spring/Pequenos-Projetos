
package com.mycompany.exercicio02;

import java.util.Scanner;


public class Somatorio {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int valor = 0;
        double media;
        
        int contagem = 0;
        int soma = 0;
        int quadrado = 0;
        
        System.out.println("Informe o valor: ");
        valor = sc.nextInt();
        soma = soma + valor;
        contagem = contagem +1;
        quadrado = quadrado + (valor * valor);
        
        
        while(valor > 0){
            System.out.println("Informe o valor: ");
            valor = sc.nextInt();
            soma = soma + valor;
            contagem = contagem +1;
            quadrado = quadrado +(valor * valor);
            
        }if (contagem > 0){
            media = soma / (contagem - 1);
            System.out.println("Soma: "+soma);
            System.out.println("Média: "+media);
            System.out.println("Quadrado: "+quadrado);
        }
    }
    
}

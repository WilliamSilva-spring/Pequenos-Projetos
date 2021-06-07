/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exe09;

import java.util.Scanner;


public class Serie_Fibonacci {

    
    public static void main(String[] args) {
        
        int cont = 0;
        int valor1 = 0;
        int valor2 = 1;
        
        System.out.println("Estrutura com while");
        while(cont < 10){
            cont += 1;
            int valor3 = valor1 + valor2;
            valor1 = valor2;
            valor2 = valor3;
            System.out.println("Serie_Fribonacce: "+valor3);
               
        }
        
        
        
    }   
    
}

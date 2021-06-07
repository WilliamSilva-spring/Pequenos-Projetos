/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exe09_2;

/**
 *
 * @author william
 */
public class Serie_Fibo_dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        int valor1 = 0;
        int valor2 = 1;
        
        do{
            cont += 1 ;
            int valor = valor1 + valor2;
            valor1 = valor2;
            valor2 = valor;
            System.out.println("Serie_Fibonacce: "+valor);
        
        }while(cont < 10);
        
    
    }
    
}

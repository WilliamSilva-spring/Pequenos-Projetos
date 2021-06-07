/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exe08;

import java.util.Scanner;


public class Leitura_Senha {

    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        int senha1 = 1234;
        int valor;
        
        int senha = 0;
        System.out.println("Informa a senha: ");
        senha = sn.nextInt();
        
        while(senha != senha1){
            System.out.println("Informe a senha: ");
            senha = sn.nextInt();
            
        }
        
        //COM DO...WHILE
        do{
            System.out.println("Informe a senha correta: ");
            valor = sn.nextInt();
            
            
        }while(valor != senha1);
        
        System.out.println("Senha correta, acesso liberado.");
    }
    
}

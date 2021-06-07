/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exe01;

import java.util.Scanner;

/**
 *
 * @author william
 */
public class Data {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner valor = new Scanner(System.in);
       
       int Dia, Mes, Ano;
        
        System.out.println("Informe a data do dia: ");
        
        Dia = valor.nextInt();
        
        System.out.println("Informe o mês de 1 a 12: ");
        
        Mes = valor.nextInt();
        
        System.out.println("Informe o ano: ");
        
        Ano = valor.nextInt();
        
        
        switch(Mes){
            
            case 1: System.out.println(Dia+" de Janeiro de "+Ano); break;
            case 2: System.out.println(Dia+" de Fevereiro de "+Ano); break;
            case 3: System.out.println(Dia+" de Março de "+Ano); break;
            case 4: System.out.println(Dia+" de Abril de "+Ano); break;
            case 5: System.out.println(Dia+" de Maio de "+Ano); break;
            case 6: System.out.println(Dia+" de Junho de "+Ano); break;
            case 7: System.out.println(Dia+" de Julho de "+Ano); break;
            case 8: System.out.println(Dia+" de Agosto de "+Ano); break;
            case 9: System.out.println(Dia+" de Setembro de "+Ano); break;
            case 10: System.out.println(Dia+" de Outubro de "+Ano); break;
            case 11: System.out.println(Dia+" de Novembro de "+Ano); break;
            case 12: System.out.println(Dia+" de Dezembro de "+Ano); break;
            default: System.out.println("Valor invalido.");
            
            
                
                
        }
        
       
        
       
       
       
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exe02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author william
 */
public class Detran_Vistoria {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       
       
       String placa;
       
        System.out.println("Informe o número da placa: ");
        
        placa = scan.nextLine();
        
        char FinalPlaca = placa.charAt(placa.length() - 1);
        int FinalPlac = Character.getNumericValue(FinalPlaca);
        
        switch(FinalPlac){
            case 0: System.out.println("Deve realizar vistória em Janeiro do próximo ano.");break;
            case 1: System.out.println("Deve realizar vistória em Fevereiro do próximo ano.");break;
            case 2: System.out.println("Deve realizar vistória em Marco do próximo ano.");break;
            case 3: System.out.println("Deve realizar vistória em Abril do próximo ano.");break;
            case 4: System.out.println("Deve realizar vistória em Maio do próximo ano.");break;
            case 5: System.out.println("Deve realizar vistória em Junho do próximo ano.");break;
            case 6: System.out.println("Deve realizar vistória em Setembro deste ano ano.");break;
            case 7: System.out.println("Deve realizar vistória em Outubro deste ano.");break;
            case 8: System.out.println("Deve realizar vistória em Novembro deste ano.");break;
            case 9: System.out.println("Deve realizar vistória em Dezembro deste ano.");break;
            default: System.out.println("Placa Invalida.");
        }
        
        
       
        
        
        
        
        
        
        
        
    }
    
}

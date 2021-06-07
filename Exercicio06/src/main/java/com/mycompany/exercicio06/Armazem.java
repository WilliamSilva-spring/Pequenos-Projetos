/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio06;

import java.util.Scanner;

public class Armazem {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String NomedaMercadoria = "";
        double PrecoUnitario = 0;
        double Quant_VendidoMes = 0;
        double Faturamento_Total_Mes = 0;
        
        System.out.println("Informe o nome do produto: ");
        NomedaMercadoria =scan.nextLine();
        
        System.out.println("Informe o preço unitário do produto: ");
        PrecoUnitario = scan.nextDouble();
        
        System.out.println("Informe o total de mercadorias vendidas no mês: ");
        Quant_VendidoMes = scan.nextDouble();
        
        if(PrecoUnitario != 0 && Quant_VendidoMes != 0 ){
            Faturamento_Total_Mes = PrecoUnitario * Quant_VendidoMes;
            System.out.println("Faturamento total no mês: R$ "+Faturamento_Total_Mes);
            
        }else{
            System.out.println("Não há valores a serem calculados.");
        }
        
        
    }
    
}

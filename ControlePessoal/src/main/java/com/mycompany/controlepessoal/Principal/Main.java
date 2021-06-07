
package com.mycompany.controlepessoal.Principal;

import com.mycompany.controlepessoal.HorarioRemedio;
import com.mycompany.controlepessoal.Remedio;
import java.time.format.DateTimeFormatter;



public class Main {

    public static void main(String[] args) {
       HorarioRemedio parseHora = HorarioRemedio.forPattern("HHmmss");
       
       Remedio remedio01 = new Remedio();
       remedio01.setPaciente("Paulo Silva");
       remedio01.setNomeRemedio("Charope");
       remedio01.setQuantDia(6);
       remedio01.setVezesnoDia(3);
       remedio01.setDosagem(12);
        

    }
    
}

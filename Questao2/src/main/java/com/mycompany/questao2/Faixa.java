
package com.mycompany.questao2;


public class Faixa {
    private int N1;

   
    
    //MÉTODOS
    public int getN1() {
        return N1;
    }

    public void setN1(int N1) {
        this.N1 = N1;
    }
    
     public void Faixa(){
         if(this.N1 >= 1 && this.N1 <= 9){
             System.out.println("O valor está na faixa permitida.");
             
         } else {
             System.out.println("O valor está fora da faixa permitida.");
        }
        
       
            
        }
    
   
    
}

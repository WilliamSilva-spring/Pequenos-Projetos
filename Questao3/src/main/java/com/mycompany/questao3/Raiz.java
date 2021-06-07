
package com.mycompany.questao3;


public class Raiz {
    private int A;
    private int B;
    private int C;
    
    
    //MÉTODOS

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }
    
    
    public int getCalculo(){
        int delt;
        delt = (this.B * this.B) - (4 * this.A * this.C);
        if(delt < 0){
            System.out.println("A equação não possue raízes reais.");
        }else if(delt > 0){
            System.out.println("A equação possue duas raízes reais.");
            
        } else if( delt == 0){
            System.out.println("A equação possue uma raíz real.");
        }
        return delt;
         
    }
    
    
    
}

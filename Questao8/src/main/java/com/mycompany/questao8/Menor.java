
package com.mycompany.questao8;


public class Menor {
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
    
    
    public int getMenor(){
        if(A < B && A < C){
            System.out.println("O A é o menor valor. A: "+this.A);
        }else if(B < A && B < C){
        System.out.println("O B é o menor valor. B: "+this.B);
        }else if(C < A && C < B){
        System.out.println("O C é o menor valor. C: "+this.C);
        }
        return 0;
        
    }
    
}

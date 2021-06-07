
package com.mycompany.questao7;


public class Maior {
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
    
    public int getMaximo(){
        if(A > B && A > C){
            System.out.println("O A é o maior valor. A: "+this.A);
        }else if(B > A && B > C){
        System.out.println("O B é o maior valor. B: "+this.B);
        }else if(C > A && C > B){
        System.out.println("O C é o maior valor. C: "+this.C);
        }
        return 0;
        
    }
    
}

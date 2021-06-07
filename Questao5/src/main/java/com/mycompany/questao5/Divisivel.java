
package com.mycompany.questao5;


public class Divisivel {
    private int A;
    private int B;
    private int C;
    private int D;
    
    
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

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }
    
    public int getRegra(){
        if((A%2)==0 && (A%3)==0){
            System.out.println("O valor A é divisível por 2 e 3. A: "+this.A);
        }else{
            System.out.println("O valor A não é divisível por 2 e 3. A: "+this.A);
        }
        if((B%2)==0 && (B%3)==0){
            System.out.println("O valor B é divisível por 2 e 3. B: "+this.B);
        }else{
            System.out.println("O valor B não é divisível por 2 e 3. B: "+this.B);
        }
        if((C%2)==0 && (C%3)==0){
            System.out.println("O valor C é divisível por 2 e 3. C: "+this.C);
        }else{
            System.out.println("O valor C não é divisível por 2 e 3. C: "+this.C);
        }
        if((D%2)==0 && (D%3)==0){
            System.out.println("O valor D é divisível por 2 e 3. D: "+this.D);
        }else{
            System.out.println("O valor D não é divisível por 2 e 3. D: "+this.D);
        }
        return 0;
        
    }
    
}

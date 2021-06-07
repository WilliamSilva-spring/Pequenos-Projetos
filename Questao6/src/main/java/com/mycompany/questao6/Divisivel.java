
package com.mycompany.questao6;


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
        if((A%2)==0){
            System.out.println("O A é divisivel por 2. A: "+this.A);
        }else if((A%3)== 0){
            System.out.println("O A é divisivel por 3. A: "+this.A);
        }else{ System.out.println("O A não é divisivel por 2 e nem por 3. A: "+this.A);}
        
        if((B%2)==0){
            System.out.println("O B é divisivel por 2. B: "+this.B);
        }else if((B%3)== 0){
            System.out.println("O B é divisivel por 3. B: "+this.B);
        }else{ System.out.println("O B não é divisivel por 2 e nem por 3. B: "+this.B);}
        
        if((C%2)==0){
            System.out.println("O C é divisivel por 2. C: "+this.C);
        }else if((C%3)== 0){
            System.out.println("O C é divisivel por 3. C: "+this.C);
        }else{ System.out.println("O C não é divisivel por 2 e nem por 3. C: "+this.C);}
        
        if((D%2)==0){
            System.out.println("O D é divisivel por 2. D: "+this.D);
        }else if((D%3)== 0){
            System.out.println("O D é divisivel por 3. D: "+this.D);
        }else{ System.out.println("O D não é divisivel por 2 e nem por 3. D: "+this.D);}
        return 0;
    }
    
    
}

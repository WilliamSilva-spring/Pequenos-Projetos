
package com.mycompany.leitor;


public class Leitor {
    private int N1;
    private int N2;

   
    

    public int getN1() {
        return N1;
        
    }

    public void setN1(int N1) {
        this.N1 = N1;
        
    }

    public int getN2() {
        return N2;
    }

    public void setN2(int N2) {
        this.N2 = N2;
        if(N1 > N2){
            System.out.println(this.N1);
    }else if(N2 > N1) {
        System.out.println(this.N2);
        }else{
        System.out.println("Os números se equivalem.");
    }
         
    
    }
    
}





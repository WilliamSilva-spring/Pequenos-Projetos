package com.mycompany.questao4;



public class Triangulo {
    private  int LadoA;
    private int LadoB;
    private int LadoC;
    
    
    //MÉTODOS

    public int getLadoA() {
        return LadoA;
    }

    public void setLadoA(int LadoA) {
        this.LadoA = LadoA;
    }

    public int getLadoB() {
        return LadoB;
    }

    public void setLadoB(int LadoB) {
        this.LadoB = LadoB;
    }

    public int getLadoC() {
        return LadoC;
    }

    public void setLadoC(int LadoC) {
        this.LadoC = LadoC;
    }
    
    public void Resutado(){
        if(this.LadoA + this.LadoB <= this.LadoC || this.LadoA + this.LadoC <= this.LadoB
                || this.LadoB + this.LadoC <= this.LadoA){
            System.out.println("Os valores informados não podem formar um triangulo.");
        }else{
            System.out.println("Os lados formam um triangulo.");
        }
        
            
        }
    
    
    
    
}

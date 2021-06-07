
package com.mycompany.questao10;


public class NotaFinal {
    private float TrabalhodeLaboratorio;
    private float AvaliacaoSemestral;
    private float ExameFinal;
    
    
    
    //MÉTODOS

    public float getTrabalhodeLaboratorio() {
        return TrabalhodeLaboratorio;
    }

    public void setTrabalhodeLaboratorio(float TrabalhodeLaboratorio) {
        this.TrabalhodeLaboratorio = TrabalhodeLaboratorio;
    }

    public float getAvaliacaoSemestral() {
        return AvaliacaoSemestral;
    }

    public void setAvaliacaoSemestral(float AvaliacaoSemestral) {
        this.AvaliacaoSemestral = AvaliacaoSemestral;
    }

    public float getExameFinal() {
        return ExameFinal;
    }

    public void setExameFinal(float ExameFinal) {
        this.ExameFinal = ExameFinal;
    }
    
    public float Calc(){
       float media = (this.TrabalhodeLaboratorio * 2 +this.AvaliacaoSemestral * 3 + 
                this.ExameFinal * 5) / 10;
       if(media == 8 && media <=10){
           System.out.println("Conceito: A");
       }else if(media >= 7 && media < 8){
           System.out.println("Conceito: B");
       }else if(media >= 6 && media < 7){
           System.out.println("Conceito: C");
       }else if(media >= 5 && media < 6){
           System.out.println("Conceito: D");
       }else if(media == 0 || media < 5){
           System.out.println("Conceito: E");
    }
        return 0;
        
        
    
    }
    
}


package com.mycompany.questao9;


public class Funcionario {
    private float Salario;
    
    
    
    //MÉTODOS

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }
    
    
    public float getSalarioAjustado(){
        float porcent = (float) 5000;
        if(this.Salario < porcent ){
            System.out.println("Novo salário: "+this.Salario * 1.3);
        }else{
            System.out.println("Seu salário não está dentro da faixa.");
        }
        return 0;
        
    
    }

   
        
    
    
    
    
    
    
    
    
    
    
}
    



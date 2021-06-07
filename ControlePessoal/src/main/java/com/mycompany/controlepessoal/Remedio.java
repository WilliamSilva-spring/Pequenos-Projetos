
package com.mycompany.controlepessoal;


public class Remedio {
    private String Paciente;
    private String NomeRemedio;
    private int QuantDia;
    private int VezesnoDia;
    private int Dosagem;
    
    //CONSTRUTOR

    public Remedio(String Paciente, String NomeRemedio, int QuantDia, int VezesnoDia, int Dosagem) {
        this.Paciente = Paciente;
        this.NomeRemedio = NomeRemedio;
        this.QuantDia = QuantDia;
        this.VezesnoDia = VezesnoDia;
        this.Dosagem = Dosagem;
    }
    
    //MÉTODOS

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public String getNomeRemedio() {
        return NomeRemedio;
    }

    public void setNomeRemedio(String NomeRemedio) {
        this.NomeRemedio = NomeRemedio;
    }

    public int getQuantDia() {
        return QuantDia;
    }

    public void setQuantDia(int QuantDia) {
        this.QuantDia = QuantDia;
    }

    public int getVezesnoDia() {
        return VezesnoDia;
    }

    public void setVezesnoDia(int VezesnoDia) {
        this.VezesnoDia = VezesnoDia;
    }

    public int getDosagem() {
        return Dosagem;
    }

    public void setDosagem(int Dosagem) {
        this.Dosagem = Dosagem;
    }
    
    
}

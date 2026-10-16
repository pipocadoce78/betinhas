package model;

public class Meta {
    
    //atributos
    private String objetivo;
    private double valorAlvo;
    private double valorPoupado;
    
    
    //construtor
    
    public Meta(String objetivo, double valorAlvo, double valorPoupado) {
        
        this.objetivo = objetivo;
        this.valorAlvo = valorAlvo;
        this.valorPoupado = valorPoupado;
    }
    
    
    //getters 
  
    public String getObjetivo() {
        
        return this.objetivo;
    }    
        
    public double getValorAlvo() {
        
        return this.valorAlvo;
    }    
        
    public double getValorPoupado() {
        
        return this.valorPoupado;
    }
    
     // setter
        
    public void setObjetivo(String objetivo) {
        
        this.objetivo = objetivo;
        
    }
    
    public void setvalorAlvo(double valorAlvo) {
        
        this.valorAlvo = valorAlvo;
        
    }
    
    public void setvalorPoupado(double valorPoupado) {
        
        this.valorPoupado = valorPoupado;
        
    }
}

package model;

public class Receita {

    //atributos
    private String origem;
    private double valor;
  
  
    //construtor
    
    public Receita(String origem, double valor) { 
        this.origem = origem;
        this.valor = valor;
    }
   
  
    //guetters setter
  
    public String getOrigem() {
        
        return this.origem;
    }    
        
    public double getValor() {
        
        return this.valor;
    }    
        
    // setter
        
    public void setOrigem(String origem) {
        
        this.origem = origem;
        
    }
    
    public void setvalor(double valor) {
        
        this.valor = valor;
        
    }
    
    

  
}

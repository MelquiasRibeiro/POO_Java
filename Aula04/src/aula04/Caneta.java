
package aula04;
public class Caneta {
    private String modelo;
    private float ponta;
    public Caneta(String m ,float p){
        this.modelo = m ;
        this.ponta = p;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
         this.modelo= m; 
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta=p;
    }
    public void status(){
        System.out.println("sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
    }
    
    }    


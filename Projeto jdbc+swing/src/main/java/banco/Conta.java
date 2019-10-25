package banco;
import java.awt.*;
import javax.swing.*;

public class Conta {
    private String titular;
    protected  float saldo;
    private boolean status;
    private int numConta;
    private String tipoConta;
    
    
    
    public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conta(String titular, int numConta,String tipoConta){
        this.setStatus(true);
        this.setTitular(titular);
        this.setSaldo(100);
        this.setNumConta(numConta);
        this.setTipoConta("cc");
        System.out.println("informações sobre a conta " + getNumConta()+": " );
        System.out.println("o saldo inicial de " + this.getTitular() + " é: R$ " + this.getSaldo() );
        System.out.println(" a conta de " + this.getTitular() + " esta " + this.getStatus()+" e seu tipo de conta é " +this.getTipoConta() );
        
        
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public boolean getStatus() {
        return status;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

            
    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    public void extrato(){
    	JOptionPane.showMessageDialog(null,"seu saldo é: "+ this.getSaldo());
    }
    public void deposito(float valor){
      if(this.getStatus()== true){
        this.setSaldo(getSaldo() + valor);
       }
      else{
    	  
    	  JOptionPane.showMessageDialog(null," você não pode Depositar, sua conta esta encerrada"); 
      }
    }
    public void sacar(float valor){
      if(this.getStatus()== true){    
            if(this.getSaldo()>= valor){ 
                this.setSaldo(getSaldo() - valor);
            }
            else{
                        
            	 JOptionPane.showMessageDialog(null," você não pode sacar, seu saldo é insuficiente");   
      }
                       
       
      }       
      else{
    	  JOptionPane.showMessageDialog(null," você não pode sacar, sua conta esta encerrada");   
      }
    }
    public void saldoConta(){
    	 JOptionPane.showMessageDialog(null,"o saldo de " + this.getTitular() + " agora é:R$ " + this.getSaldo() );
    }
    public void fecharConta(){
        if (this.getSaldo()!= 0 ){
        	 JOptionPane.showMessageDialog(null," você não pode fechar sua conta pos possui pendendcias ou ainda tem saldo restante");   
        }
        else{
            this.setStatus(false);
            JOptionPane.showMessageDialog(null,getTitular() + ", sua conta foi encerrada com sucesso");  
        
        }
    }
    
}

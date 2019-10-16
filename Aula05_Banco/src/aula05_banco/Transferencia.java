
package aula05_banco;
public class Transferencia {
   private Conta contaOrigem;
   private Conta contaDestino;

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    
    public void transferir(Conta numOrigem, Conta numDestino,float qtransferir){
        if(numOrigem.getStatus() && numDestino.getStatus() ==true ){
            if(numOrigem.getSaldo()>=qtransferir){
                 numOrigem.setSaldo(numOrigem.getSaldo()-qtransferir);
                 numDestino.setSaldo(numDestino.getSaldo()+qtransferir);
                 System.out.println("Transferencia realizada com sucesso");

            }else{
                System.out.println("Saldo insuficiente");
                }
           
        }else{
          System.out.println("Uma das contas esta inativa");
        }
        
        
    }
}

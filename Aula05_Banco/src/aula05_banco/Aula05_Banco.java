
package aula05_banco;


public class Aula05_Banco {

    public static void main(String[] args) {
        Conta C1= new Conta("Mariazinha",500f, true ,001,"poupança" );          
        Conta C2= new Conta("joão",300f, true ,002,"Conta corrente");
        
        C1.sacar(200);
        C2.sacar(200);
        
        
   Transferencia T1= new Transferencia();  
   T1.transferir(C1,C2,200f);
   
   C1.extrato();
   C2.extrato();

    }
    
}

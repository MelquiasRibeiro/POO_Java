
package aula07_uec;


public class Aula07_UEC {


    public static void main(String[] args) {
       
       Lutador L1 = new Lutador("Peixe zezinhor","br",2,0.33f,0.5f,15,5,0);
       Lutador L2 = new Lutador("Peixe frederico","eua",1,0.45f,0.4f,12,0,0);
       
       Luta luta1=new Luta();
       luta1.marcarLuta(L1, L2);
      
    }
    
}

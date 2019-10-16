
package aula04;

public class Aula04 {

    public static void main(String[] args) {
      Caneta c1 = new Caneta("modelo", 0.1f);
       c1.setPonta(0.5f);
       c1.setModelo("bic cristal");
       c1.status(); 
       
      Caneta c2 = new Caneta("modelo", 0.1f);
       c2.status();
       
      Caneta c3 = new Caneta("modelo", 0.1f);
       c3.status();
      Caneta c4 = new Caneta("modelo", 0.1f);
       c4.status();
    }
    
}

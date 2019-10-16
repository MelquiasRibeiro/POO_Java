package aula07_uec;
public class Luta {
  private Lutador desafiado;
  private Lutador desafiante;
  private int  rounds;
  private boolean  aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
  
    public void marcarLuta(Lutador desafiante,Lutador desafiado){
      if (desafiante != desafiado){
        if (desafiante.getCategoria() == desafiado.getCategoria()){
           System.out.println("Tudo ok para luta");
            this.setDesafiante(desafiante);
            this.setDesafiado(desafiado);
            this.setAprovada(true);
            lutar();
        }
        else{
           System.out.println("os lutadores não podem lutar pois estão em categorias diferentes");
           this.setDesafiante(null);
           this.setDesafiado(null);
           this.setAprovada(false);
      }
       }
      else{
           System.out.println("Um lutador não pode enfrentar a si mesmo");
           this.setDesafiante(null);
           this.setDesafiado(null);
           this.setAprovada(false);

      }
    }
 
    public void lutar(){
       if(this.getAprovada()== true){
        this.getDesafiante().apresentar();
        this.getDesafiado().apresentar();
        
        
       }
       else{
           System.out.println("esta luta não foi aprovada");
       }
    }
}

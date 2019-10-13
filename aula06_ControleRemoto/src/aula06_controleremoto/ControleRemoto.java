
package aula06_controleremoto;
public class ControleRemoto implements Controlador {
   private int volume;
   private boolean ligado;
   private boolean tocando;

    public int getVolume() {
        return volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public ControleRemoto() {
        this.volume= 50;
        this.ligado= false;
        this.tocando= false;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void deligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.println("Volume? " + this.getVolume());
        for (int i = 0; i <= this.getVolume() ; i+=10){
             System.out.println("]");
        }
    }

    @Override
    public void fecharMenu() {
         System.out.println("fecahndo menu");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()==true){
            this.setVolume(this.getVolume()+5);
        }
        else{
            System.out.println("A TV esta deligada");
        }
    }

    @Override
    public void menosVolume() {
         if(this.getLigado()==true){
            this.setVolume(this.getVolume()-5);
        }
         else{
            System.out.println("A TV esta deligada");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()==true && this.getVolume() > 0){
           this.setVolume(0); 
        }
    }

    @Override
    public void deligarMudo() {
        if (this.getLigado()==true && this.getVolume() == 0){
           this.setVolume(50); 
        }
    }

    @Override
    public void play() {
        if(this.getLigado()==true && !(this.getTocando()==true)){
            this.setTocando(true);
        }    
    }

    @Override
    public void pause() {
        if(this.getLigado()==true && this.getTocando()==true){
            this.setTocando(false);
        }
    }
   
}




package aula07_uec;
public class Lutador implements Controlador {
   private String nome;
   private String Nacionalidade;
   private int idade;
   private float  altura;
   private float peso;
   private String categoria;
   private int vitorias;
   private int derrotas;
   private int empates;

    public Lutador( String nome,String Nacionalidade, int idade,
        float  altura, float peso,int vitorias,int derrotas,
        int empates) {
        this.nome = nome;
        this.Nacionalidade=Nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
        
    }    
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
       if (getPeso()<52.2){
           System.out.println("não existe categoria para seu peso");
       }else if(getPeso()<=70.3 ){
           System.out.println("sua categoria é leve");
           this.categoria= "leve";
       }else if(getPeso()<=83.9 ){
           System.out.println("sua categoria é Médio");
           this.categoria= "Médio" ;
       }else if(getPeso()>=83.9 ){
           System.out.println("sua categoria é Pesado");
           this.categoria= "Pesado" ;
       }
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
        
    }

    @Override
    public void apresentar() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("apresentamos: " + this.getNome()+"!!!");
        System.out.println("ele que tem " + this.getPeso()+"Kg de puro musculo");
        System.out.println("tem " + this.getAltura()+"m de pura coragem");
        System.out.println("esta com " + this.getIdade()+"anos");
        System.out.println("e em toda sua carreira tem " + this.getVitorias()+" vitorias "+ this.getEmpates()+" empates e aapenas "+ this.getDerrotas()+" derrotas " );
        System.out.println("---------------------------------------------------------------------------------");

    }

    @Override
    public void status() {
     System.out.println("---------------------------------------------------------------------------------");
     System.out.println(this.getNome()+" é um " + this.getCategoria() );
     System.out.println("e em toda sua carreira tem " + this.getVitorias()
                        +" vitorias "+ this.getEmpates()+" empates e "
                        + this.getDerrotas()+" derrotas " );
     System.out.println("---------------------------------------------------------------------------------");
    }

    @Override
    public void ganharLuta() {
    this.setVitorias(getVitorias()+1);
    }

    @Override
    public void perderLuta() {
    this.setDerrotas(getDerrotas()+1);

    }

    @Override
    public void empatarLuta() {
    this.setEmpates(getEmpates()+1);    }
}

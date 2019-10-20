package Herança;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	public void fazerAniversario() {
		this.setIdade(getIdade()+1);
		System.out.println(getNome() + " agora tem " + getIdade());
	}
	
}

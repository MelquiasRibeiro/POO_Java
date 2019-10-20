package Herança;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	private boolean statusMatricula;
	
	public Aluno(int matricula, String curso) {
		super();
		this.matricula = matricula;
		this.curso = curso;
		this. statusMatricula= true;
	}
	
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean isStatusMatricula() {
		return statusMatricula;
	}

	public void setStatusMatricula(boolean statusMatricula) {
		this.statusMatricula = statusMatricula;
	}
	
	public void cancelarMtricula() {
		this.setStatusMatricula(false);
		System.out.println("matricula de " + getNome() +" cancelada com sucesso!" );
	}
		
	public void pagarMesalidade() {
		System.out.println("mensalidade de " + getNome() +" paga com sucesso!" );

	}

}

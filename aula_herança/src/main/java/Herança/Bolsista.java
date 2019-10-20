package Herança;

public class Bolsista extends Aluno {
	private float bolsa;
	private boolean statusBolsa;
	
	
	
	
	
	public Bolsista(int matricula, String curso, float bolsa, boolean statusBolsa) {
		super(matricula, curso);
		this.bolsa = bolsa;
		this.statusBolsa = statusBolsa;
	}
	

	public float getBolsa() {
		return bolsa;
	}


	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}


	public boolean isStatusBolsa() {
		return statusBolsa;
	}


	public void setStatusBolsa(boolean statusBolsa) {
		this.statusBolsa = statusBolsa;
	}

	
	@Override
	public void  pagarMesalidade()  {
		System.out.println(getNome() +"é bolsista, pagamento efetuado com sucesso!" );

		
	}
	
	public void RenovarBolsa() {
		this.setStatusBolsa(true);
		
	}
	
	

}

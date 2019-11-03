package polimosrfismo;

public class Peixe extends Animal {
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("nadando");		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("algas");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("som de peixe");
	}
	public void soltarBolha() {
		System.out.println("Bolhas, bolhas, bolhas, muitas bolhas");
	}
}

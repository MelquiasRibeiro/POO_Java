package polimosrfismo;

public class Ave extends Animal{
	private String corPena;
	
	

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	public void fazerNinho() {
		System.out.println("construindo ninho .............. Feito!");
	}
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("voando");

	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("frutas");

	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("cantar");

	}
	
	

}

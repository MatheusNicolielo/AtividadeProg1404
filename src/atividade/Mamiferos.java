package atividade;

public abstract class Mamiferos {
	protected ComunicarStrategy comunicarStrategy;
	
	public void setComunicarStrategy(ComunicarStrategy comunicarStrategy) {
		this.comunicarStrategy = comunicarStrategy;
	}
	
	public void performarComunicar() {
		comunicarStrategy.comunicar();
	}
	
}

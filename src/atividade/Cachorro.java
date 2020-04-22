package atividade;

public class Cachorro extends Mamiferos {
	public Cachorro() {
		comunicarStrategy = new ComunicarLatir();
	}
}

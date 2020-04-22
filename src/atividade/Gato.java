package atividade;

public class Gato extends Mamiferos {
	public Gato() {
		comunicarStrategy = new ComunicarMiar();
	}
}

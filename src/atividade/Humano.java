package atividade;

public class Humano extends Mamiferos{
	public Humano() {
		comunicarStrategy = new ComunicarFalar();
	}
}

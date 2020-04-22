package atividade;

public class App {
	public static void main(String[] args) {
		Mamiferos humano = new Humano();
		Mamiferos cachorro = new Cachorro();
		Mamiferos gato = new Gato();
		
		humano.performarComunicar();
		cachorro.performarComunicar();
		gato.performarComunicar();
	}
}

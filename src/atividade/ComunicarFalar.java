package atividade;

public class ComunicarFalar implements ComunicarStrategy{
	@Override
	public void comunicar() {
		System.out.println("Ola.");
	}
}

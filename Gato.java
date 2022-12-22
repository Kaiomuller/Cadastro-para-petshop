
public class Gato extends Animal {

	public  Gato(String nome, String sexo, String raca) {
		super(nome,sexo,raca);
	}
	
	public void emitirSom() {
		System.out.println("Miau!");
	}
	
	public void exibeDados() {
		super.exibeDados();
	}
}

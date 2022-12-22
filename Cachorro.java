
public class Cachorro extends Animal{

	public Cachorro (String nome, String sexo, String raca) {
		super(nome,sexo,raca);
		
	}
	
	public void emitirSom() {
		System.out.println("au au!");
	}
	public void exibeDados() {
		super.exibeDados();
	}
}

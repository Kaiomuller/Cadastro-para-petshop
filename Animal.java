
public class Animal {
private String nome;
private String sexo;
private String raca;

public Animal(String nome, String sexo, String raca) {
	this.nome = nome;
	this.sexo = sexo;
	this.raca = raca;
}

public void emitirSom() { 
	System.out.println("Emitir som...");
}

public void exibeDados() {
	System.out.println("Nome do animal: "+nome);
	System.out.println("Sexo do animal: "+sexo);
	System.out.println("Raca do animal: "+raca);
}
}



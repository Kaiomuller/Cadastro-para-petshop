import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		
		Scanner  leia = new Scanner(System.in);

		System.out.println("Para criar um Cachorro digite 1 ou Gato 2");
		System.out.println(" ");
		
		int opcao;
		opcao = leia.nextInt();
		
		Animal objeto = null;
		String nome,sexo,raca;
		
		
		if(opcao == 1){
			leia.nextLine();
			System.out.println("Nome de seu cachoro: ");
			nome = leia.nextLine();
			System.out.println("Sexo do cachorro: ");
			sexo = leia.nextLine();
			System.out.println("Raca do cachorro: ");
			raca = leia.nextLine();
			
			objeto = new Cachorro (nome,sexo,raca);
			System.out.println(" ");
			System.out.println("--Dados do seu cachorro--");
			System.out.println(" ");
			objeto.exibeDados();
			
		} else if (opcao == 2){
			leia.nextLine();
			System.out.println("Nome de seu gato: ");
			nome = leia.nextLine();
			System.out.println("Sexo de seu gato: ");
			sexo = leia.nextLine();
			System.out.println("Raca de seu gato: ");
			raca = leia.nextLine();
			
			objeto = new Gato (nome,sexo,raca);
			System.out.println(" ");
			System.out.println("--Dados do seu gato--");
			System.out.println(" ");
			objeto.exibeDados();
			
		} else {
			System.out.println("Opcao invalida!");
		}
		System.out.println(" ");
		objeto.emitirSom();

	}

}

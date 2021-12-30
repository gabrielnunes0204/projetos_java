import java.util.Scanner;

public class Exercicio_21 {
	public static void main(String[] args) {
		//Solicite um animal e mostre em inglês. (Ex.: gato, cachorro, etc..)
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o nome de um animal (sem letras maiúsculas e sem acentos): ");
		String nomeAnimal = n.nextLine();
		
		if(nomeAnimal.equals("cachorro")) {
			System.out.println("DOG");
		} else if (nomeAnimal.equals("gato")) {
			System.out.println("CAT");
		} else if (nomeAnimal.equals("tubarao")) {
			System.out.println("SHARK");
		} else if (nomeAnimal.equals("passaro") || nomeAnimal.equals("passarinho")) {
			System.out.println("BIRD");
		} else if (nomeAnimal.equals("peixe")) {
			System.out.println("FISH");
		} else {
			System.out.println("Animal ainda não cadastrado");
		}
	}
}

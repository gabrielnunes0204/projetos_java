import java.util.Scanner;

public class Exercicio_17 {
	public static void main(String[] args) {
		//Solicite o nome, e-mail, rg e cpf da pessoa. Faça uma validação simples para verificar se todos os campos foram preenchidos.
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String nome = n.nextLine();
		
		Scanner e = new Scanner(System.in);
		System.out.print("Informe o seu e-mail: ");
		String email = e.nextLine();
		
		Scanner r = new Scanner(System.in);
		System.out.print("Informe o seu RG: ");
		String rg = r.nextLine();
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe o seu CPF: ");
		String cpf = c.nextLine();

		if(nome.equals("") || email.equals("") || rg.equals("") || cpf.equals("")) {
			System.out.println("Existem campos vazios, preencha-os");
		} else {
			System.out.println("Todos os campos foram preenchidos corretamente. Obrigado.");
		}
	}
}

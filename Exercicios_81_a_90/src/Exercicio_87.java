import java.util.Scanner;

public class Exercicio_87 {
	public static void main(String[] args) {
		//Faça um programa para ler um número que é um código de usuário. Caso este código seja diferente de um código armazenado internamente no 
		//programa (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a
		//senha. Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha
		//esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe o seu código de usuário: ");
		int codigoUsuario = c.nextInt();
		
		int codigoUsuarioArmazenado = 1234;
		
		if(codigoUsuario == codigoUsuarioArmazenado) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("USUÁRIO INVÁLIDO");
		}
	}
}

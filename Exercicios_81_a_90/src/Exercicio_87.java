import java.util.Scanner;

public class Exercicio_87 {
	public static void main(String[] args) {
		//Fa�a um programa para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo seja diferente de um c�digo armazenado internamente no 
		//programa (igual a 1234) deve ser apresentada a mensagem �Usu�rio inv�lido!�. Caso o C�digo seja correto, deve ser lido outro valor que � a
		//senha. Se esta senha estiver incorreta (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�. Caso a senha
		//esteja correta, deve ser mostrada a mensagem �Acesso permitido�
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe o seu c�digo de usu�rio: ");
		int codigoUsuario = c.nextInt();
		
		int codigoUsuarioArmazenado = 1234;
		
		if(codigoUsuario == codigoUsuarioArmazenado) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("USU�RIO INV�LIDO");
		}
	}
}

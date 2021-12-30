
public class Exercicio_112 {
	public static void main(String[] args) {
		//Escreva um programa que imprima a tabuada (de 1 a 10) para os números de 1 a 10
	
		int contadorHorizontal = 1;
		
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				System.out.print(x + " X ");
				System.out.println(y + " = " + (x*y));				
			}
		}
	}
}

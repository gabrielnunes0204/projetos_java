import java.util.Scanner;

public class Exercicio_84 {
	public static void main(String[] args) {
		//Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
		
		Scanner l = new Scanner(System.in);
		System.out.print("Informe o n�mero de litros vendidos: ");
		float litrosVendidos = l.nextFloat();
		
		Scanner t = new Scanner(System.in);
		System.out.print("Informe o tipo de combust�vel (A - �lcool ou G - Gasolina): ");
		String tipoCombustivel = t.nextLine();
		
		float litroGasolina = 3.30f;
		float litroAlcool = 2.90f;
		
		float valorTotal = 0;
		float desconto  = 0;
		
		if(tipoCombustivel.equals("g") || tipoCombustivel.equals("G") && litrosVendidos <= 20) {
			valorTotal = litroGasolina * litrosVendidos;
			desconto = (valorTotal * 4) / 100;
			System.out.println("O valor total sem desconto � de R$ " + valorTotal + " e com desconto ficar� em R$ " + (valorTotal-desconto));
		} else if(tipoCombustivel.equals("g") || tipoCombustivel.equals("G") && litrosVendidos > 20) {
			valorTotal = litroGasolina * litrosVendidos;
			desconto = (valorTotal * 6) / 100;
			System.out.println("O valor total sem desconto � de R$ " + valorTotal + " e com desconto ficar� em R$ " + (valorTotal-desconto));
		} else if(tipoCombustivel.equals("a") || tipoCombustivel.equals("A") && litrosVendidos <= 20) {
			valorTotal = litroGasolina * litrosVendidos;
			desconto = (valorTotal * 3) / 100;
			System.out.println("O valor total sem desconto � de R$ " + valorTotal + " e com desconto ficar� em R$ " + (valorTotal-desconto));
		} else if(tipoCombustivel.equals("a") || tipoCombustivel.equals("A") && litrosVendidos > 20) {
			valorTotal = litroGasolina * litrosVendidos;
			desconto = (valorTotal * 5) / 100;
			System.out.println("O valor total sem desconto � de R$ " + valorTotal + " e com desconto ficar� em R$ " + (valorTotal-desconto));
		} else {
			System.out.println("Tipo de combust�vel inv�lido");
		}
	}
}

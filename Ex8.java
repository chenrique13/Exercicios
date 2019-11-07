package pacoteExercicios;
import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		double deposito, taxadeJuros, rendimento, total;
		Scanner	entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade depositada, em R$: ");
		deposito = entrada.nextDouble();
		System.out.println("Informe a taxa de juros, em %: ");
		taxadeJuros = entrada.nextDouble();
		rendimento = (deposito * (taxadeJuros/100));
		System.out.println("O rendimento do seu deposito foi de. R$: " + rendimento);
		total = (deposito + rendimento);
		System.out.println("A quantidade total de dinheiro, após deposito e rendimento é de. R$: " + total);
		entrada.close();
	}

}

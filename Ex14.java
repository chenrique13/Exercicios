package ex1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a;
		int b;

		System.out.println("Digite o primeiro numero: ");
		a = scanner.nextInt();

		System.out.println("Digite o segundo numero: ");
		b = scanner.nextInt();

		if (a > b) {
			System.out.println("O maior numero �: " + a);
		} else if (b > a){
			System.out.println("O maior numero �: " + b);
		}else {
			System.out.println("Os numeros sao iguais");
		}

	}
}

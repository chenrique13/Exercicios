package ex1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("Digite um numero: ");
		a = scanner.nextInt();

		while(a<=100) {

			b = a % 2;
			c = a % 3;

			if ((b != 0) && (c == 0)) {
				System.out.println("impares e multiplos de 3: ");
				System.out.println(a);
			} else {
			System.out.println("Numero invalido");
			}
			a = a+1;
		}
	}

}

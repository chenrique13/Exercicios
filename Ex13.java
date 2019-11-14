package ex1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a;
		int b;
		int c;
		
		System.out.println("Digite o primeiro numero: ");
		a = scanner.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		b = scanner.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("O primeiro numero �: "+ a +" o segundo numero �: " + b);
	}

}

package ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("Digite o primeiro numero: ");
		a = scanner.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		b = scanner.nextInt();
		
		c = a%b;
		d = a/b;
		
		System.out.println(a + " / " + b 
				+ " o resultado da divisao é " + d
				+ " e o resto da divisao é " + c);
		
	}

}

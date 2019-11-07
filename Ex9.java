import java.util.Scanner;
public class Exemplo9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double x, y;
		System.out.println("Digite o valor para X: ");
		x = entrada.nextDouble();
		System.out.println("Digite o valor para Y: ");
		y = entrada.nextDouble();
		if (x == 0 && y == 0) {
			System.out.println("Pertence a origem!!");
		}else
			if(x != 0 && y == 0) {
				System.out.println("Pertence ao plano do X!!");
			}else
				if(y != 0 && x ==0) {
					System.out.println("Pertence ao plano do Y!!");
				}else {
					System.out.println("Nenhuma das situações!!");
				}
		entrada.close();
	}

}

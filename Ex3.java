package pacoteExercicios;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String [] args) {
	    double n1, n2, n3, p1, p2, p3, m;
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite a nota 1: ");
	    n1 = entrada.nextDouble();
	    System.out.print("Digite o peso da nota 1: ");
	    p1 = entrada.nextDouble();
	    System.out.print("Digite a nota 2: ");
	    n2 = entrada.nextDouble();
	    System.out.print("Digite o peso da nota 2: ");
	    p2 = entrada.nextDouble();
	    System.out.print("Digite a nota 3: ");
	    n3 = entrada.nextDouble();
	    System.out.print("Digite o peso da nota 3: ");
	    p3 = entrada.nextDouble();
	    m = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);
	    System.out.print("A média ponderada vale: " + m);
	    entrada.close();
    }
}

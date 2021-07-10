import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int v = sc.nextInt();

		// A dist�ncia percorrida � igual ao tempo gasto na
		// viagem em horas vezes a velocidade m�dia da mesma
		int d = t * v;

		// A quantidade de litros necess�rio � igual a dist�cia percorrida
		// dividido pela quantidade de litros de um autom�vel que faz 12 km/l.
		double l = d / 12.0;
		System.out.printf("%.3f%n", l);

		sc.close();
	}
}

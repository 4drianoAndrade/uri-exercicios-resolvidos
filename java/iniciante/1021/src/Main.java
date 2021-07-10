import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// O uri não aceitou esse meu código
		/*
		int[] notas = { 100, 50, 20, 10, 5, 2 };
		int[] moedas = { 100, 50, 25, 10, 5, 1 };
		double[] moeda = { 1.0, 0.5, 0.25, 0.1, 0.05, 0.01 };

		double n = sc.nextDouble();

		int resto = (int) (n * 100.0);

		System.out.println("NOTAS:");

		for (int nota : notas) {

			int quociente = resto / (nota * 100);
			System.out.printf("%d nota(s) de R$ %d,00%n", quociente, nota);
			resto %= (nota * 100);
		}

		System.out.println("MOEDAS:");

		for (int i = 0; i < moedas.length; i++) {

			int quociente = resto / moedas[i];
			System.out.printf("%d moeda(s) de R$ %.2f%n", quociente, moeda[i]);
			resto %= moedas[i];
		}
		*/
		
		double n = sc.nextDouble();
		int resto = (int) (n * 100.0);

		System.out.println("NOTAS:");
		System.out.println(resto / 10000 + " nota(s) de R$ 100.00");
		resto %= 10000;
		System.out.println(resto / 5000 + " nota(s) de R$ 50.00");
		resto %= 5000;
		System.out.println(resto / 2000 + " nota(s) de R$ 20.00");
		resto %= 2000;
		System.out.println(resto / 1000 + " nota(s) de R$ 10.00");
		resto %= 1000;
		System.out.println(resto / 500 + " nota(s) de R$ 5.00");
		resto %= 500;
		System.out.println(resto / 200 + " nota(s) de R$ 2.00");
		resto %= 200;

		System.out.println("MOEDAS:");
		System.out.println(resto / 100 + " moeda(s) de R$ 1.00");
		resto %= 100;
		System.out.println(resto / 50 + " moeda(s) de R$ 0.50");
		resto %= 50;
		System.out.println(resto / 25 + " moeda(s) de R$ 0.25");
		resto %= 25;
		System.out.println(resto / 10 + " moeda(s) de R$ 0.10");
		resto %= 10;
		System.out.println(resto / 5 + " moeda(s) de R$ 0.05");
		resto %= 5;
		System.out.println(resto + " moeda(s) de R$ 0.01");

		sc.close();
	}
}

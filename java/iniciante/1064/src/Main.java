import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] values = new double[6];
		int count = 0;
		double sum = 0.0;

		for (int i = 0; i < values.length; i++) {

			values[i] = sc.nextDouble();

			// VERIFICA SE OS NÚMEROS SÃO POSITIVOS
			if (values[i] >= 0.0) {

				count++; // CONTADOR DE NÚMEROS POSITIVOS
				sum += values[i]; // SOMA TODOS OS NÚMEROS POSITIVOS
			}
		}

		double average = sum / count;

		System.out.println(count + " valores positivos");
		System.out.printf("%.1f%n", average);

		sc.close();
	}
}

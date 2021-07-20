import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] values = new double[3];
		double[] weights = { 2, 3, 5 };

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double sum = 0.0;
			double average = 0.0;

			for (int j = 0; j < values.length; j++) {

				values[j] = sc.nextDouble();
				sum += values[j] * weights[j];
			}

			average = sum / 10.0;
			System.out.printf("%.1f%n", average);
		}

		sc.close();
	}
}

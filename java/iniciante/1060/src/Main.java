import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int positive = 0;
		double[] values = new double[6];

		for (int i = 0; i < values.length; i++) {

			values[i] = sc.nextDouble();

			if (values[i] > 0.0)
				positive++;
		}

		System.out.println(positive + " valores positivos");

		sc.close();
	}
}

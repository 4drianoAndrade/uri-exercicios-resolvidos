import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;

		do {

			int count = 0;
			double sum = 0.0;

			while (count < 2) {

				double grade = sc.nextDouble();

				if (grade >= 0.0 && grade <= 10.0) {

					sum += grade;
					count++;

				} else
					System.out.println("nota invalida");
			}

			double average = sum / 2.0;
			System.out.printf("media = %.2f%n", average);

			do {

				System.out.println("novo calculo (1-sim 2-nao)");
				x = sc.nextInt();

			} while (x != 1 && x != 2);

		} while (x != 2);

		sc.close();
	}
}

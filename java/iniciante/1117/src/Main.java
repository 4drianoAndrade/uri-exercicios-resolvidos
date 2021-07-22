import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int count = 0;
		double sum = 0.0;

		do {

			double grade = sc.nextDouble();

			if (grade >= 0.0 && grade <= 10.0) {

				sum += grade;
				count++;

			} else
				System.out.println("nota invalida");

		} while (count < 2);

		double average = sum / 2.0;
		System.out.printf("media = %.2f%n", average);

		sc.close();
	}
}

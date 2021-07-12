import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if (a > Math.abs(b - c) && a < b + c) {

			double perimeter = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimeter);
		} else {

			double area = (a + b) * c / 2.0;
			System.out.printf("Area = %.1f%n", area);
		}

		sc.close();
	}
}

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double triangle = a * c / 2.0;
		double circle = Math.pow(c, 2.0) * PI;
		double trapeze = (a + b) * c / 2.0;
		double square = Math.pow(b, 2.0);
		double rectangle = a * b;

		System.out.printf("TRIANGULO: %.3f%n", triangle);
		System.out.printf("CIRCULO: %.3f%n", circle);
		System.out.printf("TRAPEZIO: %.3f%n", trapeze);
		System.out.printf("QUADRADO: %.3f%n", square);
		System.out.printf("RETANGULO: %.3f%n", rectangle);

		sc.close();
	}
}

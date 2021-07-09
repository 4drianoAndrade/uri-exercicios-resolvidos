import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();

		double area = PI * Math.pow(raio, 2.0);

		System.out.printf("A=%.4f%n", area);

		sc.close();
	}
}

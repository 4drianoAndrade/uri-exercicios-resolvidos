import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int radius = sc.nextInt();

		double volume = 4.0 / 3.0 * PI * Math.pow(radius, 3.0);
		System.out.printf("VOLUME = %.3f%n", volume);

		sc.close();
	}
}

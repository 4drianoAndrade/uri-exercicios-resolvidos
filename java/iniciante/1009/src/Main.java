import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static final double COMMISSION = 0.15;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		double salary = sc.nextDouble();
		double sales = sc.nextDouble();

		double total = (sales * COMMISSION) + salary;
		System.out.printf("TOTAL = R$ %.2f%n", total);

		sc.close();
	}
}

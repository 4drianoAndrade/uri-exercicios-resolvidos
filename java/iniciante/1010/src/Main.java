import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int code1 = sc.nextInt();
		int number1 = sc.nextInt();
		double value1 = sc.nextDouble();

		int code2 = sc.nextInt();
		int number2 = sc.nextInt();
		double value2 = sc.nextDouble();

		double valueToPay = number1 * value1 + number2 * value2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valueToPay);

		sc.close();
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcohol = 0, gasoline = 0, diesel = 0;
		int fuel = sc.nextInt();

		while ((fuel = sc.nextInt()) != 4) {

			switch (fuel) {

			case 1:
				alcohol++;
				break;
			case 2:
				gasoline++;
				break;
			case 3:
				diesel++;
				break;
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcohol);
		System.out.println("Gasolina: " + gasoline);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}

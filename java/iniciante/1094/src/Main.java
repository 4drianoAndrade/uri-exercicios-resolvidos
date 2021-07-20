import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int rabbits = 0, rats = 0, frogs = 0;

		for (int i = 0; i < n; i++) {

			int amount = sc.nextInt();
			char type = sc.next().charAt(0);

			if (type == 'C')
				rabbits += amount;
			else if (type == 'R')
				rats += amount;
			else
				frogs += amount;
		}

		int total = rabbits + rats + frogs;
		double percentRabbits = (double) rabbits / total * 100.0;
		double percentRats = (double) rats / total * 100.0;
		double percentFrogs = (double) frogs / total * 100.0;

		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + rabbits);
		System.out.println("Total de ratos: " + rats);
		System.out.println("Total de sapos: " + frogs);
		System.out.printf("Percentual de coelhos: %.2f %%%n", percentRabbits);
		System.out.printf("Percentual de ratos: %.2f %%%n", percentRats);
		System.out.printf("Percentual de sapos: %.2f %%%n", percentFrogs);

		sc.close();
	}
}

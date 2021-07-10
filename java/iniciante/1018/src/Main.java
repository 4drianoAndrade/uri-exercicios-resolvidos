import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };

		int n = sc.nextInt();
		System.out.println(n);

		for (int nota : cedulas) {

			int div = n / nota;
			System.out.printf("%d nota(s) de R$ %d,00%n", div, nota);
			n %= nota;
		}

		sc.close();
	}
}

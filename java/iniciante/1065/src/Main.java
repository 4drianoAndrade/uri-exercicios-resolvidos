import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] values = new int[5];
		int pair = 0;

		for (int i = 0; i < values.length; i++) {

			values[i] = sc.nextInt();

			// VERIFICA SE É PAR
			if (values[i] % 2 == 0)
				pair++; // CONTADOR DE NÚMEROS PARES
		}

		System.out.println(pair + " valores pares");

		sc.close();
	}
}

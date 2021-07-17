import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] values = new int[5];
		int even = 0, odd = 0, positive = 0, negative = 0;

		for (int i = 0; i < values.length; i++) {

			values[i] = sc.nextInt();

			// VERIFICA SE É PAR OU ÍMPAR
			if (values[i] % 2 == 0)
				even++;
			else
				odd++;

			// VERIFICA SE O NÚMERO É POSITIVO OU NEGATIVO
			if (values[i] > 0)
				positive++;
			else if (values[i] < 0)
				negative++;
		}

		System.out.println(even + " valor(es) par(es)");
		System.out.println(odd + " valor(es) impar(es)");
		System.out.println(positive + " valor(es) positivo(s)");
		System.out.println(negative + " valor(es) negativo(s)");

		sc.close();
	}
}

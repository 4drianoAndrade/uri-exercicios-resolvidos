import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int z, count = 0, sum = 0;

		do {
			z = sc.nextInt();

		} while (z <= x);

		for (int i = x; sum <= z; i++) {

			count++;
			sum += i;
		}

		System.out.println(count);

		sc.close();
	}
}

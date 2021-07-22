import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int min = 1, max = 4;

		for (int i = 0; i < n; i++) {

			for (int j = min; j < max; j++)
				System.out.print(j + " ");

			System.out.println("PUM");

			min += 4;
			max += 4;
		}

		sc.close();
	}
}

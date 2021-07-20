import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] values = new int[100];
		int bigger = 0, index = 0;

		for (int i = 0; i < 100; i++) {

			values[i] = sc.nextInt();

			if (values[i] > bigger) {

				bigger = values[i];
				index = i + 1;
			}
		}

		System.out.println(bigger);
		System.out.println(index);

		sc.close();
	}
}

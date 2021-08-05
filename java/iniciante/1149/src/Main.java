import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] values = sc.nextLine().split(" ");
		int a = Integer.parseInt(values[0]);
		int sum = 0;

		for (int i = 1; i < values.length; i++) {

			int n = Integer.parseInt(values[i]);

			if (n > 0)
				for (int j = 0; j < n; j++)
					sum += a + j;
		}

		System.out.println(sum);

		sc.close();
	}
}

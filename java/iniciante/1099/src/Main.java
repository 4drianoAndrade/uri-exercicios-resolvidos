import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] values = new int[2];
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int sum = 0;

			for (int j = 0; j < 2; j++)
				values[j] = sc.nextInt();

			Arrays.sort(values);

			for (int k = values[1] - 1; k > values[0]; k--)
				if (k % 2 == 1)
					sum += k;

			System.out.println(sum);
		}

		sc.close();
	}
}

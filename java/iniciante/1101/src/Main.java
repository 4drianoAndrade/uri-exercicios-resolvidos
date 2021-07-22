import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] values = new int[2];

		while ((values[0] = sc.nextInt()) > 0 && (values[1] = sc.nextInt()) > 0) {

			Arrays.sort(values);
			int sum = 0;

			for (int i = values[0]; i <= values[1]; i++) {

				System.out.print(i + " ");
				sum += i;
			}

			System.out.println("Sum=" + sum);
		}

		sc.close();
	}
}

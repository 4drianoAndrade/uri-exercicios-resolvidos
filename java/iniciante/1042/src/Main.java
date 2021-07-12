import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] values = new int[3];
		int[] order = new int[3];

		for (int i = 0; i < values.length; i++) {

			values[i] = sc.nextInt();
			order[i] = values[i];
		}

		Arrays.sort(order);

		for (int value : order)
			System.out.println(value);

		System.out.println();

		for (int value : values)
			System.out.println(value);

		sc.close();
	}
}

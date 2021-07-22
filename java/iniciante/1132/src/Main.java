import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] values = new int[2];
		int sum = 0;

		for (int i = 0; i < values.length; i++)
			values[i] = sc.nextInt();

		Arrays.sort(values);

		for (int i = values[0]; i <= values[1]; i++)
			if (i % 13 != 0)
				sum += i;

		System.out.println(sum);

		sc.close();
	}
}

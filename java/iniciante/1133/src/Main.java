import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] values = new int[2];

		for (int i = 0; i < values.length; i++)
			values[i] = sc.nextInt();

		Arrays.sort(values);

		for (int i = values[0] + 1; i < values[1]; i++)
			if (i % 5 == 2 || i % 5 == 3)
				System.out.println(i);

		sc.close();
	}
}

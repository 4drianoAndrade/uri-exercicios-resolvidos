import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int previous = 0, current = 1, next;

		for (int i = 1; i <= n; i++) { // 5

			if (i == n)
				System.out.println(previous); // 5 = 5 : true
			else
				System.out.print(previous + " "); // 2

			next = previous + current; // 5
			previous = current; // 3
			current = next; // 5
		}

		// 0 1 1 2 3
		sc.close();
	}
}

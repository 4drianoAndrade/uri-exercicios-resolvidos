import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int biggerAB = (a + b + Math.abs(a - b)) / 2;

		if (biggerAB > c)
			System.out.println(biggerAB + " eh o maior");
		else
			System.out.println(c + " eh o maior");

		sc.close();
	}
}

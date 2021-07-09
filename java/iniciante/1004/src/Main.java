import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int prod = x * y;

		System.out.println("PROD = " + prod);

		sc.close();
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int end = sc.nextInt();
		int duration;

		if (start < end)
			duration = end - start;
		else
			duration = 24 - start + end;

		System.out.println("O JOGO DUROU " + duration + " HORA(S)");

		sc.close();
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] segundos = { 3600, 60, 1 };
		int[] tempo = new int[3];

		for (int i = 0; i < segundos.length; i++) {

			tempo[i] = n / segundos[i];
			n %= segundos[i];
		}

		System.out.println(tempo[0] + ":" + tempo[1] + ":" + tempo[2]);

		sc.close();
	}
}

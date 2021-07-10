import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ageInDays = sc.nextInt();

		int[] days = { 365, 30, 1 };
		int[] date = new int[3];

		for (int i = 0; i < days.length; i++) {

			date[i] = ageInDays / days[i];
			ageInDays %= days[i];
		}

		System.out.println(date[0] + " ano(s)");
		System.out.println(date[1] + " mes(es)");
		System.out.println(date[2] + " dia(s)");

		sc.close();
	}
}

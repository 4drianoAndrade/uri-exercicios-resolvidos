import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hourInitial = sc.nextInt();
		int minuteInitial = sc.nextInt();
		int hourFinal = sc.nextInt();
		int minuteFinal = sc.nextInt();

		int start = hourInitial * 60 + minuteInitial;
		int end = hourFinal * 60 + minuteFinal;

		int duration;

		if (start < end)
			duration = end - start;
		else
			duration = 24 * 60 - start + end;

		int durationHours = duration / 60;
		int durationMinutes = duration % 60;

		System.out.println("O JOGO DUROU " + durationHours + " HORA(S) E " + durationMinutes + " MINUTO(S)");

		sc.close();
	}
}

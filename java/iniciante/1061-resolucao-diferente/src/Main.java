import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int start = dateEvent();
		int end = dateEvent();
		int duration = end - start;

		System.out.println(duration / 86400 + " dia(s)");
		duration %= 86400;
		System.out.println(duration / 3600 + " hora(s)");
		duration %= 3600;
		System.out.println(duration / 60 + " minuto(s)");
		duration %= 60;
		System.out.println(duration + " segundo(s)");

		sc.close();
	}

	public static int dateEvent() {

		String s = sc.nextLine();
		String[] dayString = s.split(" ");
		s = sc.nextLine();
		String[] time = s.split(" : ");

		int day = Integer.parseInt(dayString[1]);
		int hour = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);
		int second = Integer.parseInt(time[2]);

		int quantity = second + minute * 60 + hour * 3600 + day * 86400;

		return quantity;
	}
}

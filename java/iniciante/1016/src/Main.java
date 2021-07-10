import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int km = sc.nextInt();

		// Regra de três: 60/x = 30/km
		// tempo = 60 minutos vezes a distância em km
		// dividido pela diferença da distância entre x e y;
		int t = 60 * km / 30;
		System.out.println(t + " minutos");

		sc.close();
	}
}

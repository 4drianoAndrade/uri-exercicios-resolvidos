import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, inter = 0, gremio = 0, empates = 0, grenais = 0;

		do {

			int i = sc.nextInt();
			int g = sc.nextInt();

			if (i > g)
				inter++;
			else if (i < g)
				gremio++;
			else
				empates++;

			grenais++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			x = sc.nextInt();

		} while (x != 2);

		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + inter);
		System.out.println("Gremio:" + gremio);
		System.out.println("Empates:" + empates);

		if (inter > gremio)
			System.out.println("Inter venceu mais");
		else if (inter < gremio)
			System.out.println("Gremio venceu mais");
		else
			System.out.println("Nao houve vencedor");

		sc.close();
	}
}


public class Main {

	public static void main(String[] args) {

		int I = 0, J = 3, K = 2;

		while (I < 3) {

			for (int i = I; i < J; i++)
				System.out.printf("I=%d J=%d%n", I, i + 1);

			K = 2;

			while (K < 9 && I < 2) {

				for (int j = I + 1; j < J + 1; j++)
					System.out.printf("I=%d.%d J=%d.%d%n", I, K, j, K);

				K += 2;
			}

			I++;
			J += 1;
		}
	}
}


public class Main {

	public static void main(String[] args) {

		int j = 7;

		for (int i = 1; i < 10; i += 2) {

			for (int k = j; k > j - 3; k--)
				System.out.println("I=" + i + " J=" + k);

			j += 2;
		}
	}
}

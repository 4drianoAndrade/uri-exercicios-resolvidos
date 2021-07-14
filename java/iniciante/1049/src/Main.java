import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word1 = sc.next();
		String word2 = sc.next();
		String word3 = sc.next();

		if (word1.equals("vertebrado")) {
			if (word2.equals("ave")) {
				if (word3.equals("carnivoro"))
					System.out.println("aguia");
				else
					System.out.println("pomba");
			} else {
				if (word3.equals("onivoro"))
					System.out.println("homem");
				else
					System.out.println("vaca");
			}
		} else {
			if (word2.equals("inseto")) {
				if (word3.equals("hematofago"))
					System.out.println("pulga");
				else
					System.out.println("lagarta");
			} else {
				if (word3.equals("hematofago"))
					System.out.println("sanguessuga");
				else
					System.out.println("minhoca");
			}
		}

		sc.close();
	}
}

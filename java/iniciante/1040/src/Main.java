import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float grade1 = sc.nextFloat();
		float grade2 = sc.nextFloat();
		float grade3 = sc.nextFloat();
		float grade4 = sc.nextFloat();

		float average = (grade1 * 2f + grade2 * 3f + grade3 * 4f + grade4) / 10f;

		System.out.printf("Media: %.1f%n", average);

		if (average >= 7f)
			System.out.println("Aluno aprovado.");
		else if (average < 5f)
			System.out.println("Aluno reprovado.");
		else {

			System.out.println("Aluno em exame.");
			float exam = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", exam);
			average = (average + exam) / 2f;

			if (average >= 5f)
				System.out.println("Aluno aprovado.");
			else
				System.out.println("Aluno reprovado.");

			System.out.printf("Media final: %.1f%n", average);
		}

		sc.close();
	}
}

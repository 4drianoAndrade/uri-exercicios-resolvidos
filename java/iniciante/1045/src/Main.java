import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] vect = new double[3];
		double[] vectDec = new double[3];

		for (int i = 0; i < vect.length; i++)
			vect[i] = sc.nextDouble();

		Arrays.sort(vect);

		int cont = 0;

		for (int i = vect.length - 1; i >= 0; i--) {

			vectDec[cont] = vect[i];
			cont++;
		}

		double a = vectDec[0], b = vectDec[1], c = vectDec[2];

		if (a >= b + c)
			System.out.println("NAO FORMA TRIANGULO");
		else if (a * a == b * b + c * c)
			System.out.println("TRIANGULO RETANGULO");
		else if (a * a > b * b + c * c)
			System.out.println("TRIANGULO OBTUSANGULO");
		else
			System.out.println("TRIANGULO ACUTANGULO");

		if (a == b && b == c)
			System.out.println("TRIANGULO EQUILATERO");
		else if (a == b || b == c || a == c)
			System.out.println("TRIANGULO ISOSCELES");

		sc.close();
	}
}

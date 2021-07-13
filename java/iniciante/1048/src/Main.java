import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salary = sc.nextDouble();
		double newSalary = salary;

		if (salary >= 0.0 && salary <= 400.0)
			newSalary += salary * 0.15;
		else if (salary > 400.0 && salary <= 800.0)
			newSalary += salary * 0.12;
		else if (salary > 800.0 && salary <= 1200.0)
			newSalary += salary * 0.10;
		else if (salary > 1200.0 && salary <= 2000.0)
			newSalary += salary * 0.07;
		else if (salary > 2000.0)
			newSalary += salary * 0.04;

		double correction = newSalary - salary;
		double percentage = correction / salary * 100.0;

		System.out.printf("Novo salario: %.2f%n", newSalary);
		System.out.printf("Reajuste ganho: %.2f%n", correction);
		System.out.printf("Em percentual: %.0f %%%n", percentage);

		sc.close();
	}
}

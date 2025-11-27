import java.util.Scanner;

public class beecrowd1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n = 3.14159;
		double R = sc.nextDouble();	
		double A = n * (R*R);
		System.out.printf("A=%.4f\n", A);
		sc.close();
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String nome     = sc.next();
		double salarioF = sc.nextDouble();
		double totalV   = sc.nextDouble();
		double salarioT = (salarioF + (totalV * 0.15));
		
		System.out.printf("TOTAL = R$ %.2f\n", salarioT);
		sc.close();
	}

}
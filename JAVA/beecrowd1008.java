import java.util.Scanner;

public class beecrowd1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int numF    = sc.nextInt();
		int horaT   = sc.nextInt();
		double salarioH = sc.nextDouble();
		double salarioT = (horaT * salarioH);
		
		System.out.println("NUMBER = " + numF);
		System.out.printf("SALARY = U$ %.2f\n",salarioT);
		sc.close();
	}

}

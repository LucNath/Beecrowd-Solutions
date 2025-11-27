import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pesoA = 2;
		double pesoB = 3;
		double pesoC = 5;
		double A = Math.round((sc.nextDouble()*10));
		double B = Math.round((sc.nextDouble()*10));
		double C = Math.round((sc.nextDouble()*10));
		A        = A/10;
		B		 = B/10;	
		C 		 = C/10;
		double MEDIA = (A*pesoA + B*pesoB + C*pesoC)/(pesoA + pesoB + pesoC);	
		
		System.out.printf("MEDIA = %.1f\n", MEDIA);
			
		sc.close();
	}
  }
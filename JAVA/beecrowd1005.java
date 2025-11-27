import java.util.Scanner;

public class beecrowd1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		double A = Math.round((sc.nextDouble()*10));
		double B = Math.round((sc.nextDouble()*10));
		A        = A/10;
		B		 = B/10;	
		double MEDIA = (A*3.5 + B*7.5)/11;	
		
		System.out.printf("MEDIA = %.5f\n", MEDIA);
			
		sc.close();
	}
  }

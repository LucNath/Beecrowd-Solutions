import java.io.IOException;
import java.util.Scanner;
public class beecrowd1115 {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
		int x = 1;
		int y = 1;
	    while (x != 0 && y != 0) {
	    	x = sc.nextInt();
			y = sc.nextInt();
			if (x > 0 && y > 0) System.out.println("primeiro");
			else if (x < 0 && y > 0) System.out.println("segundo");
			else if (x < 0 && y < 0) System.out.println("terceiro");
			else if (x > 0 && y < 0)System.out.println("quarto");			
		} 
    }
}

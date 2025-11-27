import java.io.IOException;
import java.util.Scanner;

public class beecrowd1589 {
    public static void main(String[] args) throws IOException {
  Scanner prompt = new Scanner(System.in);  
  int r1, r2;
  int T = prompt.nextInt();
  for(int i = 0; i < T; i++)
  {
r1 = prompt.nextInt();  
r2 = prompt.nextInt();
System.out.println(r1+r2);  
  }
    }
}

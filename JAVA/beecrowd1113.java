import java.io.IOException;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) throws IOException {
      Scanner prompt = new Scanner(System.in);        
        int x =-1;
        int y =-2;                       
        while (x != y) {        		
        	x = prompt.nextInt();        
        	y = prompt.nextInt();
        	if (x > y) {
        	   System.out.println("Decrescente");
        	}else if (x < y){
        	   System.out.println("Crescente");
        	}        		        
        }
    }
}
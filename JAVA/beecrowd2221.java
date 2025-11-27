import java.io.IOException;
import java.util.Scanner;

public class beecrowd2221 {

public static void main(String[] args) throws IOException {
    Scanner prompt = new Scanner(System.in);
    int T = prompt.nextInt();
    int B, Ai1, Di1, Li1, Ai2, Di2, Li2, Pi1, Pi2;
    for (int i = 0; i < T; i++) {
    B = prompt.nextInt();
    Ai1 = prompt.nextInt();
    Di1 = prompt.nextInt();
    Li1 = prompt.nextInt();
    Ai2 = prompt.nextInt();
    Di2 = prompt.nextInt();
    Li2 = prompt.nextInt();
    Pi1 = ((Ai1 + Di1) / 2) + (Li1 % 2 == 0 ? B : 0);
    Pi2 = ((Ai2 + Di2) / 2) + (Li2 % 2 == 0 ? B : 0);
    if (Pi1 > Pi2) System.out.println("Dabriel");
    else if (Pi2 > Pi1) System.out.println("Guarte");
    else System.out.println("Empate");
    }
    }

}

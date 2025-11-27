import java.io.IOException;
import java.util.Scanner;

public class beecrowd2708 {

    public static void main(String[] args) throws IOException {
    Scanner prompt = new Scanner(System.in);
    int turistas = 0;
    int jipes = 0;
    while (true) {
    String input = prompt.next();
    if (input.equals("SALIDA")) {
    jipes++;
    turistas += prompt.nextInt();
    }
    else if (input.equals("VUELTA")) {
    jipes--;
    turistas -= prompt.nextInt();
    } else {
    break;
    }
    }
    System.out.println(turistas);
    System.out.println(jipes);
    }
   
}

import java.util.Scanner;

public class beecrowd2708 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jipes = 0;
        int turistas = 0;
        
        while (true) {
            String comando = sc.next();
            
            if (comando.equals("SALIDA")) {
                jipes++;
                turistas += sc.nextInt();
            } 
            else if (comando.equals("VUELTA")) {
                jipes--;
                turistas -= sc.nextInt();
            } 
            else if (comando.equals("ABEND")) {
                break;
            }
        }
        
        System.out.println(turistas);
        System.out.println(jipes);
        
        sc.close();
    }
}
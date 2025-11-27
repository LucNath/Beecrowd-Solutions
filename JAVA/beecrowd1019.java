import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua soluÃ§Ã£o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluciÃ³n ejecutar
 */
public class beecrowd1019 {
 
    public static void main(String[] args) throws IOException {
 
        int hora, minuto, segundo;  
        Scanner prompt = new Scanner(System.in);      
   segundo = prompt.nextInt();
   hora = segundo/3600;
   minuto = (segundo/60)%60;
   segundo %= 60;
   System.out.println(hora+":"+minuto+":"+segundo);
    }
 
}

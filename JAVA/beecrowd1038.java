import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Locale l = Locale.forLanguageTag("en-US");
String[][] produto= {
{"1","Cachorro Quente", "4.00"},
{"2","X-Salada", "4.50"},
{"3","X-Bacon", "5.00"},
{"4","Torrada Simple", "2.00"},
{"5","Refrigerante", "1.50"},
};
Scanner prompt = new Scanner(System.in);

int codigo = prompt.nextInt();
int qtde = prompt.nextInt();

System.out.printf("Total: R$ %.2f%n",Double.parseDouble(produto[codigo-1][2])*qtde);

    }
 
}
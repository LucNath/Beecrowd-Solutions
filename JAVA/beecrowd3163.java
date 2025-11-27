import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class beecrowd3163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Deque<String> norte = new LinkedList<>();
        Deque<String> leste = new LinkedList<>();
        Deque<String> sul = new LinkedList<>();
        Deque<String> oeste = new LinkedList<>();
        
        while (true) {
            String linha = sc.nextLine().strip();
            if (linha.equals("0")) break;
            
            String[] partes = linha.split(" ");
            int direcao = Integer.parseInt(partes[0]);
            String voo = partes[1];
            
            switch (direcao) {
                case 1: norte.addLast(voo);  break;  // Norte
                case 2: leste.addLast(voo);  break;  // Leste
                case 3: sul.addLast(voo);    break;  // Sul
                case 4: oeste.addLast(voo);  break;  // Oeste
            }
        }
        
        // Ordem de decolagem: Oeste → Sul → Leste → Norte
        StringBuilder resultado = new StringBuilder();
        
        while (!oeste.isEmpty()) resultado.append(oeste.removeFirst()).append(" ");
        while (!sul.isEmpty())   resultado.append(sul.removeFirst()).append(" ");
        while (!leste.isEmpty()) resultado.append(leste.removeFirst()).append(" ");
        while (!norte.isEmpty()) resultado.append(norte.removeFirst()).append(" ");
        
        // Remove o espaço extra do final (se houver)
        if (resultado.length() > 0) {
            resultado.setLength(resultado.length() - 1);
        }
        
        System.out.println(resultado.toString());
        
        sc.close();
    }
}
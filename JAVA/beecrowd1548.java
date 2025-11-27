import java.util.Scanner;

class beecrowd1548 {
    int prioridade;
    int posicao;
     
    No anterior;
    No proximo;

    public No(int prioridade, int posicao) {
        this.prioridade = prioridade;
        this.posicao = posicao;
        this.anterior = null;
        this.proximo = null;
    }
}

class beecrowd1548 {
    No primeiro;
    No ultimo;

    int cont;

    public FilaPioridadeOrdenada() {
        primeiro = null;
        ultimo = null;
    }

    public void inQueue(int prioridade, int posicao) {

        No novo = new No(prioridade, posicao);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            if (novo.prioridade > primeiro.prioridade) { // InÃ­cio da lista
                novo.proximo = primeiro;
                primeiro.anterior = novo;
                primeiro = novo;
            } else if (novo.prioridade <= ultimo.prioridade) { // Fim da lista
                ultimo.proximo = novo;
                novo.anterior = ultimo;
                ultimo = novo;
            } else { // Meio da lista
                No aux = primeiro;

                while (aux != null) {
                    if (novo.prioridade <= aux.prioridade && novo.prioridade > aux.proximo.prioridade) {
                        novo.proximo = aux.proximo;
                        aux.proximo.anterior = novo;
                        aux.proximo = novo;
                        novo.anterior = aux;
                        break;
                    }

                    aux = aux.proximo;
                }
            }
        }

        cont++;
    }

    public boolean isEmpty() {
        if(primeiro == null) {
            return true;
        }
        return false;
    }

    public int deQueue() {
        if (cont > 0) {
    
            int removido = primeiro.prioridade;
        
            if (primeiro == ultimo) {
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = primeiro.proximo;
                primeiro.anterior = null;
            }
        
            cont--;
            return removido;
        }
        
        return -1;
    }


    public int front() {
        if(!isEmpty()) {

        }
        return primeiro.prioridade;
    }

    public int size() {
        return cont-1;
    }

    public void clear() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }

    @Override
    public String toString() {
         No aux = primeiro;
         String str = "[";

         while (aux != null) {
             str += " " + aux.prioridade;
             if(aux.proximo != null) {
                 str += " ";
             }
             aux = aux.proximo;
         }

         return str + " ]";
    }
    
    public int troca() {
        No aux = primeiro;
        
        int trocou = 0;
        int index = 1;
        while (aux != null) {
            if(aux.posicao == index) {
                trocou++;
            }
            index++;
            aux = aux.proximo;
        }
        
        return trocou;
    }
}

public class beecrowd1548 {
	public static void main(String[] args) {
	    Scanner dado = new Scanner(System.in);
		
		FilaPioridadeOrdenada fila = new FilaPioridadeOrdenada();
		
		int testes = dado.nextInt();
		dado.nextLine();
		
		for(int n = 0; n < testes; n++) { 
		    int quantidade = dado.nextInt();
		    dado.nextLine();
		    
		    String notas = dado.nextLine();
            String[] prioridades = notas.split(" ");
    
            for (int p = 0; p < prioridades.length; p++) {
                int prioridade = Integer.parseInt(prioridades[p]);
                int posicao = p+1;
                fila.inQueue(prioridade, posicao);
            }
    
    		System.out.println(fila.troca());
    		
    		fila.clear();
		}
		
	}
}

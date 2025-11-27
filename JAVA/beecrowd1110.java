import java.util.Scanner;

public class beecrowd1110 {
	int Vetor[];
	int inicio;
	int fim;
	int capacidade;
	int count;

	public Main(int size){
		Vetor = new int[size];
		inicio = 0;
		fim = -1;
		capacidade = size;
		count = 0;
	}

	public int size(){
		return count;
	}

	public void Add(int valor){
		if (fim == -1){
			Vetor[inicio] = valor;
			fim = 0;
			count++;    
		}else{
			if (count < capacidade){
				Vetor[count] = valor;
				fim++;
				count++;
			}else{
				capacidade+=10;
				int v[] = new int[capacidade];
				for (int i = inicio; i <=fim; i++){
					v[i] = Vetor[i];
				}
				Vetor = new int[capacidade];
				Vetor = v;
				Vetor[count] = valor;
				count++;
				fim++;
			}
		}    
	}

	public void remover(){
		if (fim==-1){  
			System.out.println("A fila estÃ¡ vaizia!");
		}else{
			inicio++;
			count--;
		}      
	}

	public void sendToFinal(){
		int primeiro = Vetor[inicio];
		for (int i=inicio; i<=fim-1;i++){
			Vetor[i]=Vetor[i+1];
		}
		Vetor[fim]= primeiro;
	}

	public int top(){
		return inicio;
	}

	public void clear(){
		inicio= 0;
		fim   = -1;
		count = 0;
		Vetor = new int[50];
	}

	public void exibe(){
		for(int i=inicio; i<=fim;i++){
			System.out.print(Vetor[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main filaCartoes = new Main(10); 
		Main filaDescarte = new Main(10); 

		Scanner sc = new Scanner(System.in); 

		int quant = sc.nextInt();
		int count = 1; 

		while (sc.hasNextInt()){       

			if (count<quant) filaCartoes.Add(count); 
			else if (quant>0)
			{
				filaCartoes.Add(count);  
				while (filaCartoes.size()>1){
					filaDescarte.Add(filaCartoes.Vetor[filaCartoes.top()]);  
					filaCartoes.remover();  
					filaCartoes.sendToFinal();  
				}  
				System.out.print("Discarded cards: ");
				String Descarte = "";
				for(int i=filaDescarte.inicio;i<=filaDescarte.fim;i++){
					Descarte += filaDescarte.Vetor[i]+ ", ";  
				}

				if (Descarte != null){
					if ( Descarte.length()>0)
						Descarte = Descarte.substring(0, Descarte.length()-2);
					System.out.println(Descarte);  
				}    
				System.out.print("Remaining card: ");
				System.out.println(filaCartoes.Vetor[filaCartoes.top()]);
				filaCartoes.clear();
				filaDescarte.clear();            
				count = 0;
				quant = sc.nextInt();
			}    
			if (quant == 0) break;
			count++;
		}
		sc.close();  
	}
}

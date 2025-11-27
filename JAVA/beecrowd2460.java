import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner Sc = new Scanner(System.in);

        int tam_fila_cheia = Sc.nextInt();
        Organizador_de_fila fila_cheia = new Organizador_de_fila(tam_fila_cheia);
        for (int i =0; i<tam_fila_cheia; i++){
            fila_cheia.enqueued(Sc.nextInt());
        }

        int tam_saiu_fila = Sc.nextInt();
        Organizador_de_lista saiu_fila = new Organizador_de_lista(tam_saiu_fila);
        for (int i =0; i<tam_saiu_fila;i++){
            saiu_fila.add(Sc.nextInt());
        }

        Organizador_de_lista nova_fila = new Organizador_de_lista(tam_fila_cheia-tam_saiu_fila);
        while (!fila_cheia.isEnpty()){
            int aux = fila_cheia.dequeue();
            if(!saiu_fila.contem(aux)){
                //System.out.print(aux);
                nova_fila.add(aux);
            }
        }
        nova_fila.print();
    }
}
class Organizador_de_lista {

    private int[] elemento;

    private int tamanho;

    public Organizador_de_lista(int capacidadde) {
        this.elemento = new int[capacidadde];
        this.tamanho = 0;
    }

    public void add(int elemento) {
        if (tamanho < this.elemento.length) {
            this.elemento[this.tamanho] = elemento;
            tamanho++;
        }
    }


    public boolean contem(int elemento) {
        boolean aux= false;
        for (int i = 0; i < tamanho; i++) {
            if (this.elemento[i]==(elemento)) {
                aux = true;
                break;
            } else {
                aux=false;
            }
        }
        if(aux == true){
            return  true;
        }else{
            return false;
        }
    }
    
    public void print() {
        for (int i = 0 ; i<tamanho;i++) {
            System.out.print(elemento[i]);
            if (i != tamanho-1 ) {
                System.out.print(" ");
            }
        }
        System.out.println();

    }
    
}

class Organizador_de_fila {

    private int[] elemento;

    private int tamanho;

    public  Organizador_de_fila(int capacidade){

        this.elemento = new int[capacidade];
        this.tamanho=0;
    }

    public void enqueued(int Elemento) {

        this.elemento[this.tamanho] = Elemento;
        this.tamanho++;

    }

    public int dequeue() {

        int aux = elemento[0];

        for (int i =0; i<this.tamanho-1;i++){
            this.elemento[i] = this.elemento[i+1];
        }

        tamanho--;

        return  aux;
    }

    public  boolean isEnpty(){
        if(this.tamanho==0){
            return true;
        }else {
            return false;
        }
    }
}
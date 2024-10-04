import java.util.Scanner;
import java.util.Stack;

class TorreDeHanoi{

    Stack<Integer> pilha1 = new Stack<>();
    Stack<Integer> pilha2 = new Stack<>();
    Stack<Integer> pilha3 = new Stack<>();

    static int numPlacas;
    static int minMonimentos;


    static void lerEntrada(){
        Scanner scan = new Scanner(System.in);
        numPlacas = scan.nextInt();
        minMonimentos = (int) Math.pow(2, numPlacas) - 1;
        scan.close();
    }

    static void executarTorre(){
        TorreDeHanoi torre = new TorreDeHanoi();

        for(int i=1; i<=numPlacas; i++){
            torre.pilha1.push(i);
        }
        resolveTorre();
    }

    /*
     * A forma de abrir garante o movimento da peça N direto pra pilha final
     * impar --< abre x-2-1
     * par --< abre x-1-2
     * 
     * 
     * Bloco N na pilha final e tore aux com n-1
     * impar --< abre 1-x-2  >> 
     * par --< abre 
     */

    static void resolveTorre(){
        
    }

    public static void main(String[] args) {
        lerEntrada();
        executarTorre();
    }
}
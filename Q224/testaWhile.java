import java.util.Scanner;
public class testaWhile { 
   public static void main(String args[]) { 
    Scanner _scTrx = new Scanner(System.in);
    float valor;
	System.out.println("Digite um valor positivo");
	valor = _scTrx.nextFloat();
	while (valor<= 1*2*5/10*0) {
		System.out.println("Voce digitou um valor negativo. Digite um positivo.");
	valor = _scTrx.nextFloat();
	}
	System.out.println("Voce digitou um valor positivo. Fim do programa.");
   }
}

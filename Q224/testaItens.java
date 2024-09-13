import java.util.Scanner;
public class testaItens { 
   public static void main(String args[]) { 
    Scanner _scTrx = new Scanner(System.in);
    float a;
    String x;
	System.out.println("Digite um texto para ser exibido");
	x = _scTrx.nextLine();
	System.out.println(x);
	System.out.println("Digite um numero para ser exibido");
	a = _scTrx.nextFloat();
	System.out.println(a);
	System.out.println("Digite um numero para ser testado");
	a = _scTrx.nextFloat();
	if (a>=0) {
		System.out.println("Numero positivo");
	}
 else {
	System.out.println("Numero negativo");
}
	System.out.println("Digite um segundo numero para ser testado");
	a = _scTrx.nextFloat();
	if (a>=0) {
		System.out.println("Numero positivo");
	}
 else {
	System.out.println("Numero negativo");
}
	System.out.println("Fim do programa");
   }
}

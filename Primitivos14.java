import java.util.Scanner;

public class Primitivos14 {
	public static void main(String[] args){
		Scanner numero = new Scanner(System.in);
		System.out.println("Coloque Nota 1 (Ex. 7,5)");
		float n1 = numero.nextFloat();
		System.out.println("Coloque Nota 2 (Ex. 7,5)");
		float n2 = numero.nextFloat();
		System.out.println("Coloque Nota 3 (Ex. 7,5)");
		float n3 = numero.nextFloat();
 		float media = (n1+n2+n3)/3;
		System.out.println("A média das notas é = " + media);
	}
} 
import java.util.Scanner;

public class Primitivos10 {
	public static void main(String[] args){
		Scanner numero = new Scanner(System.in);
		System.out.println("Coloque um número inteiro!");
		int insere = numero.nextInt();
 		insere += 2;
		System.out.println("Número inserido +2 = " + insere);
	}
}
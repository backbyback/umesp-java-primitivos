import java.util.Scanner;

public class Primitivos13 {
	public static void main(String[] args){
		Scanner numero = new Scanner(System.in);
		System.out.println("Coloque um número inteiro!");
		int calculo = numero.nextInt();
 		calculo *= 6;
 		calculo /= 8;
		System.out.println("Número inserido *6 e /8 = " + calculo);
	}
}
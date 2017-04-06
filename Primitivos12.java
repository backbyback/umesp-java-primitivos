import java.util.Scanner;

public class Primitivos12 {
	public static void main(String[] args){
		Scanner numero = new Scanner(System.in);
		System.out.println("Coloque um número inteiro!");
		int multiplica = numero.nextInt();
 		multiplica *= 10;
		System.out.println("Número inserido *10 = " + multiplica);
	}
}
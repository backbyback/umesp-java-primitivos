import java.util.Scanner;

public class Primitivos11 {
	public static void main(String[] args){
		Scanner numero = new Scanner(System.in);
		System.out.println("Coloque um número inteiro!");
		int retira = numero.nextInt();
 		retira -= 3;
		System.out.println("Número inserido -3 = " + retira);
	}
}
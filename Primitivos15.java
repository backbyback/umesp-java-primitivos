import java.util.Scanner;

public class Primitivos15 {
	public static void main(String[] args){
		float kmProva1 = 5;
		float kmProva2 = 10;
		float kmProva3 = 16;
		float kmProva4 = 21;
		float tempoMedio = ((kmProva1/10.5f) + (kmProva2/10.5f) + (kmProva3/10.5f) + (kmProva4/10.5f))/4;
		tempoMedio *= 60;
		System.out.println("O tempo médio gasto em relação as provas foi = " + tempoMedio + ", minutos.");
	}
} 
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12 && hora >= 6) {
			System.out.println("Bom dia");
		} else if (hora >= 12 && hora <=18) {	
			System.out.println("Boa tarde");			
		} else if (hora < 6 || hora >18){
			System.out.println("Boa noite");
		} else {
			System.out.println("Hora inv�lida");
		}
					
		sc.close();
	}
}

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que l� n�meros inteiros at� que um zero seja lido. Ao final
		 * mostra a soma dos n�meros lidos.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha v�rios n�meros");
		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}

		System.out.println("A soma deu: " + soma);

		sc.close();
	}

}

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que lê números inteiros até que um zero seja lido. Ao final
		 * mostra a soma dos números lidos.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha vários números");
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

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		char a;
		a = sc.next().charAt(0);

		System.out.println("Voc� digitou: " + x);
		System.out.println("Voc� digitou: " + y);
		System.out.println("Voc� digitou: " + z);
		System.out.println("Voc� digitou: " + a);

		sc.close();

	}

}

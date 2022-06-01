

public class FuncoesMatematicas {

	public static void main(String[] args) {

		//FORMULA DE BASKARA
		
		double a, b, c;
		double delta, x1, x2;
		a = 2;
		b = 3;
		c = 4;
		
		delta = Math.pow(b, 2.0) - (4*a*c);
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (+b + Math.sqrt(delta)) / (2.0 * a);

		System.out.println(x1);
		System.out.println(x2);
	}

}

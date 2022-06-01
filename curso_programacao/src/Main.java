import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá, mundo!");
		System.out.println("Bom dia");
		
		int y = 32;
		
		System.out.println(y);
		
		double x = 10.37784;
		
		Locale.setDefault(Locale.US);
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.printf("Resultado: %.2f%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",  nome, idade, renda);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n",product1, price1);
		System.out.printf("%s, which price is $ %.2f %n",product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (Three decimal places): %.3f%n", measure);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		//Calcular área de um trapézio:
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("A área do trapézio é: "+ area);
		
		int a, c;
		double resultado;
		a = 5;
		c = 2;
		
		resultado = (double) a/c;
		
		System.out.println(resultado);
		
	}

}

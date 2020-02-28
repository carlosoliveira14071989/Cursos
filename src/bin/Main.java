package bin;

public class Main {

	public static void main(String[] args) {
		
		double x = 1.28222;
		System.out.println("Ola mundo");
		System.out.println("bom dia");
		System.out.printf("%.2f%n",x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n" ,x);
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}

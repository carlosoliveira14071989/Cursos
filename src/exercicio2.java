import java.util.Scanner;

/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

 * 
 * */


public class exercicio2 {

	public static void main(String[] args) {
		
		
		double area = 0;
		double pi = 3.14159;
		double raio = 0;
		Scanner sc = new Scanner(System.in);
						
		System.out.println("Digite o valor do raio");
        raio = sc.nextDouble();
        
        area = pi * raio * raio ;
        
        System.out.printf("O valor da área é %.4f: ",  area);
        
        sc.close();
        
	}

}

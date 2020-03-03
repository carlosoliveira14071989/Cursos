/*
 * Fazer um programa para ler quatro 
 * valores inteiros A, B, C e D. A seguir, 
 * calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a 
fórmula: DIFERENCA = (A * B - C * D).
 * 
 * */

package bin;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	
		
	int a,b,c,d = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o valor de a");
	a = sc.nextInt();
	System.out.println("Digite o valor de b");
	b = sc.nextInt();
	System.out.println("Digite o valor de c");
	c = sc.nextInt();
	System.out.println("Digite o valor de d");
	d = sc.nextInt();
	
	
		
    int produto = (a*b)-(c*d);
    System.out.println("O valor do cálculo é " +produto);
	}

}

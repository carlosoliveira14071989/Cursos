import java.util.Scanner;
public class calculos {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		String x;
		x = sc.next();
		
		System.out.println("Você digitou:" + x);
		
		int d;
		d = sc.nextInt();
		System.out.println("Você digitou:" + d);
		
		System.out.println(x+ " possui " +d + " anos");
		
		
		
		sc.close();
		
		

	}

}

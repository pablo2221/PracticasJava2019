package ejercisiosPractica;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAreaCirculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio del circulo");
		sc.useLocale(Locale.US);
		double radio = sc.nextDouble();
		
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area del circulo es "+area);

	}

}

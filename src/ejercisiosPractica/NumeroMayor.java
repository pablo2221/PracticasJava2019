package ejercisiosPractica;

import libs.Input;

public class NumeroMayor {

	public static void main(String[] args) {
		
		System.out.print("Digite el dato del primer numero a utilizar"+"\n");
		float primerNumero = Input.get_int();
		
		System.out.print("Digite el dato del segundo numero a utilizar"+"\n");
		float segundoNumero = Input.get_int();
		
		if (primerNumero>=segundoNumero) {
			
			if (primerNumero==segundoNumero) {
				
				System.out.print("Los numeros "+primerNumero+" Y "+segundoNumero+" Son iguales");
			
			} else {
				
				System.out.println("El número "+primerNumero+" es mayor que el número "+segundoNumero);
				
			} 
				
			
		
		}else {
			
			System.out.println("El número "+segundoNumero+" es mayor que el número "+primerNumero);
			
		}

	}

}

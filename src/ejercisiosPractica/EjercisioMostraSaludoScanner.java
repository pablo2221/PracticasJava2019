package ejercisiosPractica;

import java.util.Scanner;

public class EjercisioMostraSaludoScanner {

	public static void main(String[] args) {
		
		//Nos aparece un cuadro de dialogo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre=sc.nextLine();
  
        System.out.println("Bienvenido "+nombre);

	}

}

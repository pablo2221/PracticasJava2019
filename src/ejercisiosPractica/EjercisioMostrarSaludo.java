package ejercisiosPractica;

import libs.Input;

public class EjercisioMostrarSaludo {

	public static void main(String[] args) {
		
		System.out.print("Hola!!! Digite su nombre por favor"+"\n");
		String nombre = Input.get_string();
		
		System.out.println("Bienvenido "+nombre+", es un gusto ayudarle");
		
	}

}

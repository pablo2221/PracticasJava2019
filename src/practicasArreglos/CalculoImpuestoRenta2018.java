package practicasArreglos;

public class CalculoImpuestoRenta2018 {
	
	static double salario = 1450000;
	
	static double salarioEmbargable;
	static double porcentaje;
	static double salarioEmbargadoRenta;
	
	static double salarioEmbargable1;
	static double porcentaje1;
	static double salarioEmbargadoRenta1;
	static double salarioEmbargadoRentafranjaDoble;

	public static void main(String[] args) {
		
		if (salario<799000) {
			
			System.out.println("El salario ingresado "+salario+ " Colones, no paga impuesto sobre la renta segun la reglamentacion de Costa Rica para el 2018");
			
		} 
		
		if (salario > 799000 && salario<=1199000) {
			
			salarioEmbargable = (salario-799000);
			porcentaje = 0.1;
			salarioEmbargadoRenta = salarioEmbargable*porcentaje;
			
			System.out.println("El salario ingresado "+salario+ " Colones, paga un monto de "+salarioEmbargadoRenta+" Colones de impuesto sobre la renta segun la reglamentacion de Costa Rica para el 2018");
			
			
		}
		
		if (salario>1199000) {
			
			salarioEmbargable1 = (salario-1199000);
			porcentaje1 = 0.15;
			salarioEmbargadoRenta1 = salarioEmbargable1*porcentaje1;
			
			salarioEmbargadoRentafranjaDoble = salarioEmbargadoRenta+salarioEmbargadoRenta1;
			
			System.out.println("El salario ingresado "+salario+ " Colones, paga un monto de "+salarioEmbargadoRentafranjaDoble+" de los cuales sobre el exceso de 799.000 mensuales y hasta 1.199.000 el tributo por 10% es de: "+salarioEmbargadoRenta+" y sobre el exceso de 1.199.000 el tributo a descontar es de:"+salarioEmbargadoRenta1+" Colones");
			
			
		}
		
		

	}

	

}

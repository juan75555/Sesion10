import java.util.Scanner;
public class Tarea1 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Selecciona tu conversor: ");
		System.out.println("1) Milla-Km ");
		System.out.println("2) Km-Yarda ");
		System.out.println("3) Libra - Kg.");
		System.out.println("¿Cual es tu opción?");
		
		int opcion = t.nextInt();
		
		/*
		 * 1 Milla = 1.609344Km
		 * 1Km = 1093.6133 yardas
		 * 1 Libra = 0.45359237 Kg
		 */
		
		switch(opcion) {
		case 1:
			//millas a kilometros
			System.out.print("Introduce millas");
			double millas = t.nextDouble();
			double km = millas*1.609344;
			System.out.printf("%f millas son %f km.\n", millas,km);
			break;
		case 2:
			//kilometros a yardas
			System.out.print("Introduce kilometros");
			double kilometros = t.nextDouble();
			double yardas = kilometros*1093.6133;
			System.out.printf("%f millas son %f yardas.\n", kilometros,yardas);
			break;
		case 3:
			System.out.print("Introduce kilometros");
			double libras = t.nextDouble();
			double kg = libras*0.45359237;
			System.out.printf("%f millas son %f kg.\n", libras,kg);
			break;
		default:
			System.out.println("Opcion desconocida");
		}

	}

}

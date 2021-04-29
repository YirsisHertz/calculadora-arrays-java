package calculadora_arrays;

import java.util.Scanner;

import operaciones.Operaciones;

/**
 * @author Yirsis Serrano
 *
 */
public class Calculadora {

	private static Scanner scanner = new Scanner(System.in);
	private static double[] numeros1;
	private static double[] numeros2;
	private static double[] resultados;

	/**
	 * @param i = iterador
	 *
	 */

	public static void main(String[] args) {

		int opcion;

		while (true) {
			System.out.println("\nOperaciones con arreglos");

			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("5. Salir\n");

			try {

				System.out.print("Ingresa la opcion seleccionada: ");
				opcion = scanner.nextInt();

				if (opcion == 5) {
					System.err.println("Gracias por usar el programa, vuelve pronto.");
					System.exit(0);
				}

				System.out.print("Ingresa cuantos valores vas a ingresar: ");
				int valores = scanner.nextInt();

				numeros1 = new double[valores];
				numeros2 = new double[valores];
				resultados = new double[valores];

				Operaciones operaciones = new Operaciones(numeros1, numeros2, resultados);

				switch (opcion) {
				case 1:
					operaciones.sumar();
					break;
				case 2:
					operaciones.restar();
					break;
				case 3:
					operaciones.multiplicar();
					break;
				case 4:
					operaciones.dividir();
					break;
				default:
					System.err.println("Opcion Invalida, intenta otra vez...");
					break;
				}

				operaciones.getResultados();
				System.gc(); // esto limpia la memoria

			} catch (Exception e) {
				System.err.println("Seleccion invalida, intenta mas tarde...");
			}

		}
	}
}

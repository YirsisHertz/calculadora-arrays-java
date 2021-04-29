package calculadora_arrays;

import java.util.Scanner;

public class Calculadora {

	private static Scanner scanner = new Scanner(System.in);

	private static double[] numeros1;
	private static double[] numeros2;
	private static double[] resultados;

	private static void setValores(int i) {
		System.out.print("Ingresa el primer valor: ");
		numeros1[i] = scanner.nextDouble();

		System.out.print("Ingresa el segundo valor: ");
		numeros2[i] = scanner.nextDouble();

	}

	private static void getResultados() {
		System.out.println("\nResultados");
		System.out.println("==========\n");

		for (double resultado : resultados) {
			System.out.println(resultado);
		}
	}

	private static void sumar() {
		for (int i = 0; i < numeros1.length; i++) {

			System.out.println("Suma Numero #" + (i + 1));

			setValores(i);

			resultados[i] = numeros1[i] + numeros2[i];
		}
	}

	private static void restar() {
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Resta Numero #" + (i + 1));

			setValores(i);

			resultados[i] = numeros1[i] - numeros2[i];
		}
	}

	private static void multiplicar() {
		for (int i = 0; i < numeros1.length; i++) {

			System.out.println("Multiplicacion Numero #" + (i + 1));

			setValores(i);

			resultados[i] = numeros1[i] * numeros2[i];
		}
	}

	private static void dividir() {
		for (int i = 0; i < numeros1.length; i++) {

			System.out.println("Division Numero #" + (i + 1));

			setValores(i);

			resultados[i] = numeros1[i] / numeros2[i];
		}
	}

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

				switch (opcion) {
				case 1:
					sumar();
					break;
				case 2:
					restar();
					break;
				case 3:
					multiplicar();
					break;
				case 4:
					dividir();
					break;
				default:
					System.err.println("Opcion Invalida, intenta otra vez...");
					break;
				}

				getResultados();
				System.gc();

			} catch (Exception e) {
				System.err.println("Seleccion invalida, intenta mas tarde...");
			}

		}
	}
}

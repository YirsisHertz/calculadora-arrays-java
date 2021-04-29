package operaciones;

import java.util.Scanner;

public class Operaciones {

	private Scanner scanner = new Scanner(System.in);

	private double[] numeros1;
	private double[] numeros2;
	private double[] resultados;

	public Operaciones(double[] numeros1, double[] numeros2, double[] resultados) {
//		super();
		this.numeros1 = numeros1;
		this.numeros2 = numeros2;
		this.resultados = resultados;
	}

	private void setValores(int i) {
		System.out.print("Ingresa el primer valor: ");
		numeros1[i] = scanner.nextDouble();

		System.out.print("Ingresa el segundo valor: ");
		numeros2[i] = scanner.nextDouble();

	}

	public void sumar() {
		for (int i = 0; i < numeros1.length; i++) {

			System.out.println("Suma Numero #" + (i + 1));

			setValores(i);

			resultados[i] = numeros1[i] + numeros2[i];
		}
	}

	public void restar() {
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Resta Numero #" + (i + 1));

			setValores(i);

			resultados[i] = numeros1[i] - numeros2[i];
		}
	}

	public void multiplicar() {
		for (int i = 0; i < numeros1.length; i++) {

			System.out.println("Multiplicacion Numero #" + (i + 1));

			setValores(i);

			resultados[i] = numeros1[i] * numeros2[i];
		}
	}

	public void dividir() {
		for (int i = 0; i < numeros1.length; i++) {

			System.out.println("Division Numero #" + (i + 1));

			setValores(i);

			resultados[i] = numeros1[i] / numeros2[i];
		}
	}

	public void getResultados() {
		System.out.println("\nResultados");
		System.out.println("==========\n");

		for (double resultado : resultados) {
			System.out.println(resultado);
		}
	}
}

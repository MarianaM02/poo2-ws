package seleccion;

import java.util.Arrays;

public class Vector<E extends Comparable<E>> {
	private E vector[];

	public E[] getVector() {
		return vector;
	}

	public void setVector(E[] vector) {
		this.vector = vector;
	}

	@Override
	public String toString() {
		return (Arrays.toString(this.vector));
	}

	public Integer[] crearArrayIntegerPrueba(int tamanio) {
		Integer[] array = new Integer[tamanio];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		return array;
	}

	public void ordenarSeleccion() {
		Long tiempoInicial = System.currentTimeMillis();
		int posicionActual = 0;
		int tamanio = vector.length;
		int posicionMenor;
		E aux = null;
		while (posicionActual < tamanio) {
			posicionMenor = posicionActual;
			for (int i = posicionActual; i < tamanio; i++) {
				// encontrar menor
				if (vector[i].compareTo(vector[posicionMenor]) < 0) {
					posicionMenor = i;
				}
			}
			// pasarlo a la posicion actual, intercambiar
			aux = vector[posicionActual];
			vector[posicionActual] = vector[posicionMenor];
			vector[posicionMenor] = aux;
			// muevo posicion actual
			posicionActual++;
		}
		System.out.println("Tiempo Selección = " + (System.currentTimeMillis() - tiempoInicial));
	}


	public void ordenarBurbujeo() {
		Long tiempoInicial = System.currentTimeMillis();
		int tamanio = vector.length;
		E aux = null;

		for (int i = 0; i < tamanio; i++) {
			for (int j = 0; j < tamanio - 1; j++) {
				if (vector[j].compareTo(vector[j + 1]) > 0) {
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}
			}
		}

		System.out.println("Tiempo Burbujeo = " + (System.currentTimeMillis() - tiempoInicial));
	}

	public void ordenarInsercion() {
		Long tiempoInicial = System.currentTimeMillis();
		int tamanio = vector.length;

		E auxClave = null;
		int j;
		for (int i = 1; i < tamanio; i++) {
			auxClave = vector[i];
			j = i - 1;
			while (j >= 0 && vector[j].compareTo(auxClave) > 0) {
				vector[j + 1] = vector[j];
				j = j - 1;
			}
			vector[j + 1] = auxClave;
		}
		System.out.println("Tiempo Inserción = " + (System.currentTimeMillis() - tiempoInicial));
	}

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		Integer[] arr = vec.crearArrayIntegerPrueba(9000);
		//System.out.println("Desordenado: " + Arrays.toString(arr));

		vec.setVector(arr.clone());
		vec.ordenarSeleccion();
		//System.out.println("Ordenado: " + vec);

		vec.setVector(arr.clone());
		vec.ordenarBurbujeo();
		//System.out.println("Ordenado: " + vec);

		vec.setVector(arr.clone());
		vec.ordenarInsercion();
		//System.out.println("Ordenado: " + vec);

	}

}

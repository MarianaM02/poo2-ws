package recursivo;

public class Recursivas {

	public static int gauss(int n) {
		try {
			if (n < 0)
				throw new ParametroIncorrectoException("Parámetro incorrecto");

			if (n == 0)
				return 0;
			return n + gauss(n - 1);
		}

		catch (ParametroIncorrectoException pie) {
			pie.printStackTrace();
			;
			return 0;
		}
	}

	public static int factorial(int x) {
		if (x == 0)
			return 1;
		return x * factorial(x - 1);
	}

	public static String invertirCadena(String cadena) {

		if (cadena.length() <= 1)
			return cadena;
		
		return cadena.charAt(cadena.length() - 1) 
				+ invertirCadena(cadena.substring(1, cadena.length() - 1))
				+ cadena.charAt(0);
	}
	
	public static boolean esPalindromo(String texto) {
	    if (texto.length() <= 1) {
	        return true;
	    }

	    char primero = texto.charAt(0);
	    char ultimo = texto.charAt(texto.length() - 1);

	    String interior = removerExtremos(texto);
	    return (primero == ultimo) && esPalindromo(interior);
	}

	private static String removerExtremos(String texto) {
	    return texto.substring(1, texto.length()-1);
	}

	public static void imprimirDecimal(int n , int b) {
		   if (n >= b) {
		       imprimirDecimal(n / b, b);
		   }

		   System.out.print(n % b);
		}

	

	public static int cantidadDeUnosVleo(int n) {
		int suma = 0;
		if (n <= 1)
			suma = 1;
		else {
			if (n % 2 != 0)
				suma++;
			suma += cantidadDeUnosVleo(n / 2);
		}
		return suma;
	}
	
	public static int cantidadDeUnosVfabi(int n) {
		if(n <=1 )
			return n;
		return n % 2 + cantidadDeUnosVfabi(n/2);
		

	}

	public static int mcd(int a, int b) {

		if (b == 0)
			return a;

		return mcd(b, a % b);
	}
	
	public static int sumarArreglo(int[] v) {
		if(v.length == 0)
			return 0;
		return sumarArreglo(0, v);
	}

	private static int sumarArreglo(int i, int[] v) {
		if(i==v.length-1)
			return v[i];
		
		return v[i] + sumarArreglo(i+1,v);
	}
	
	public static int pico(int[] v) {
		return pico(0, v.length-1, v);
	}

	private static int pico(int pri, int ult, int[] v) {
		int med = (pri+ult)/2;
		
		if(v[med-1] < v[med] && v[med] > v[med+1])
			return med;
		
		if(v[med-1] < v[med] && v[med] < v[med+1]) //creciente
			return pico(med+1, ult, v);
		
		if(v[med-1] > v[med] && v[med] > v[med+1]) //decreciente
			return pico(pri, med-1, v);
		
		return -1;
	}

	
	
	public static long fibonacci(long n) {
		if(n < 2)
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static long fibonacciTab(int n) {
		long [] aux = new long[n+1];
		aux[0] = 1;
		aux[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			aux[i] = aux[i-2] + aux[i-1];
		}
			
		return aux[n];
		
	}
	
	public static long fiboDin(int n) {
		long [] fiboVec = new long[n+1];
		fiboVec[0] = 1;
		fiboVec[1] = 1;
		for (int i = 2; i <= n; i++) 
			fiboVec[i] = -1;			
		return fiboLookBack(fiboVec, n);
	}

	private static long fiboLookBack(long[] fiboVec, int n) {
		if(fiboVec[n] != -1)
			return fiboVec[n];
		
		return fiboVec[n] = fiboLookBack(fiboVec, n-1) + fiboLookBack(fiboVec, n-2);
	}
	

}




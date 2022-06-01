package recursivo;

public class Fibonacci {

	public static long fibonacci(long n) {
		if (n < 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static long fiboConMem(int n) {
		long[] fiboVec = new long[n + 1];
		fiboVec[0] = 1;
		fiboVec[1] = 1;
		
		return fiboLookBack(fiboVec, n);
	}

	private static long fiboLookBack(long[] fiboVec, int n) {
		if (fiboVec[n] != 0)
			return fiboVec[n];

		return fiboVec[n] = fiboLookBack(fiboVec, n - 1) + fiboLookBack(fiboVec, n - 2);
	}

	public static void main(String[] args) {
		int n = 46;
		long tIni = System.currentTimeMillis();
		System.out.println(fibonacci(n));
		long tFin = System.currentTimeMillis();
		System.out.println("fibonacci recursiva: " + (tFin - tIni) + " ms");

		tIni = System.currentTimeMillis();
		System.out.println(fiboConMem(n));
		tFin = System.currentTimeMillis();
		System.out.println("fibonacci con memorizacion: " + (tFin - tIni) + " ms");

	}

}

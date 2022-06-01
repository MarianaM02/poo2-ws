
package exceptions;

/**
 *
 */
public class MatricesDiferentesTamaniosException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MatricesDiferentesTamaniosException() {
        super("Las matrices no se pueden operar porque tienen tamanios diferentes.");
    }
    
}

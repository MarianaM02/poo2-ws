package grafos;

import java.util.Objects;

public class Arista<T> implements Comparable<Arista<T>>{
	private Nodo<T> origen;
	private Nodo<T> destino;
	private Integer peso;
	
	public Arista(Nodo<T> origen, Nodo<T> destino, Integer peso) {
		this.origen	= origen;
		this.destino = destino;
		this.peso = peso;
	}
	public Arista(Nodo<T> origen, Nodo<T> destino) {
		this(origen, destino, 1);
	}
	
	public Nodo<T> getOrigen() {
		return origen;
	}

	public Nodo<T> getDestino() {
		return destino;
	}

	public Integer getPeso() {
		return peso;
	}

	public Arista<T> aristaInversa() {
		return new Arista<T>(destino, origen, peso);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(destino, origen, peso);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("unchecked")
		Arista<T> other = (Arista<T>) obj;
		return Objects.equals(peso, other.peso) 
				&& (
				(destino.equals(other.getDestino()) && origen.equals(other.getOrigen()))
				|| 
				(destino.equals(other.getOrigen()) && origen.equals(other.getDestino())));
	}
	@Override
	public int compareTo(Arista<T> o) {
		return Integer.compare(this.peso, o.getPeso());
	}
	@Override
	public String toString() {
		return origen + "-" + peso + "-" + destino ;
	}
	
}

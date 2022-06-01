package grafos;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Nodo<T> implements Comparable<Nodo<T>> {
	private T data;
	private List<Arista<T>> aristas = new LinkedList<Arista<T>>();
	private Integer distancia = Integer.MAX_VALUE;
	private List<Nodo<T>> caminoMasCorto = new LinkedList<>();
	
	public Nodo(T data) {
		this.data = data;
	}

	public void agregarArista(Arista<T> arista) {
		this.aristas.add(arista);
	}

	public T getData() {
		return data;
	}
	
	public List<Arista<T>> getAristas() {
		return aristas;
	}

	public Integer getDistancia() {
		return distancia;
	}

	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}

	public List<Nodo<T>> getCaminoMasCorto() {
		return caminoMasCorto;
	}

	public void setCaminoMasCorto(List<Nodo<T>> caminoMasCorto) {
		this.caminoMasCorto = caminoMasCorto;
	}

	public String caminoMasCortoToString() {
		String camino = this.caminoMasCorto.stream()
				.map(Nodo<T>::toString)
				.collect(Collectors.joining(" -> "));
		return camino.isBlank() ? 
				"%s : %s".formatted(this.data, this.distancia) : 
				"%s -> %s : %s".formatted(camino, this.data, this.distancia);
	}

	@Override
	public int compareTo(Nodo<T> o) {
		return Integer.compare(this.distancia, o.getDistancia());
	}


	@Override
	public int hashCode() {
		return Objects.hash(data);
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
		Nodo<T> other = (Nodo<T>) obj;
		return Objects.equals(data, other.data);
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
}

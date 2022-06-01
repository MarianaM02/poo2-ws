package grafos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;

import pilas_colas.ArrayStack;

public class GrafoLista<T> implements Grafo<T> {
	private List<Nodo<T>> nodos = new ArrayList<>();
	private boolean dirigido;

	public GrafoLista(boolean esDirigido) {
		this.dirigido = esDirigido;
	}

	public List<Nodo<T>> getNodos() {
		return nodos;
	}

	public boolean isDirigido() {
		return dirigido;
	}

	public void agregarNodo(Nodo<T> nodo) {
		if (!this.nodos.contains(nodo)) {
			this.nodos.add(nodo);			
		}
	}

	public void agregarArista(Nodo<T> origen, Nodo<T> destino, Integer peso) {
		agregarNodo(origen);
		agregarNodo(destino);
		Arista<T> arista = new Arista<T>(origen, destino, peso);
		origen.agregarArista(arista);
		if (!this.dirigido) {
			arista = new Arista<T>(destino, origen, peso);
			destino.agregarArista(arista);
		}
	}
	public void agregarArista(Nodo<T> origen, Nodo<T> destino) {
		agregarArista(origen, destino, 1);
	}

	////////////////////////////////////////////////////////////////////////
	@Override
	public boolean dfs(Nodo<T> inicio) {
		Set<Nodo<T>> visitados = new LinkedHashSet<Nodo<T>>();
		ArrayStack<Nodo<T>> pila = new ArrayStack<Nodo<T>>(nodos.size());
		pila.push(inicio);
		while (!pila.isEmpty()) {
			Nodo<T> nodo = pila.pop();
			if (visitados.add(nodo)) {
				for (Arista<T> a : nodo.getAristas()) {
					pila.push(a.getDestino());
				}
			}
		}
		return visitados.containsAll(this.nodos);
	}

	// TODO Arreglar DFS recursivo 
	public boolean dfsRecursivo(Nodo<T> inicial, Set<Nodo<T>> visitados) {
		for (Arista<T> a : inicial.getAristas()) {
			Nodo<T> nodoAdyacente = a.getDestino();
			if (visitados.add(nodoAdyacente)) {
				dfsRecursivo(nodoAdyacente, visitados);
			}
		}
		return visitados.containsAll(this.nodos);
	}

	@Override
	public boolean bfs(Nodo<T> inicial) {
		Set<Nodo<T>> visitados = new LinkedHashSet<>();
		Queue<Nodo<T>> cola = new ArrayDeque<>(nodos.size());
		cola.offer(inicial);
		visitados.add(inicial);
		while (!cola.isEmpty()) {
			Nodo<T> nodo = cola.poll();
			for (Arista<T> a : nodo.getAristas()) {
				if (visitados.add(a.getDestino())) {
					cola.offer(a.getDestino());
				}
			}
		}
		return visitados.containsAll(this.nodos);
	}

	////////////////////////////////////////////////////////////////////////
	@Override
	public void dijkstra(Nodo<T> inicial) {
		Integer distancia = 0;
		inicial.setDistancia(distancia);
		Set<Nodo<T>> nodosEstablecidos = new HashSet<>();
		Queue<Nodo<T>> nodosNoEstablecidos = new PriorityQueue<>();
		nodosNoEstablecidos.add(inicial);
		Nodo<T> nodoActual;
		while (!nodosNoEstablecidos.isEmpty()) {
			nodoActual = nodosNoEstablecidos.poll();
			for (Arista<T> a : nodoActual.getAristas()) {
				if (!nodosEstablecidos.contains(a.getDestino())) {
					distancia = a.getPeso();
					evaluarDistanciaYCamino(a.getDestino(), distancia, nodoActual);
					nodosNoEstablecidos.add(a.getDestino());
				}
			}
			nodosEstablecidos.add(nodoActual);
		}
	}

	private void evaluarDistanciaYCamino(Nodo<T> adyacente, Integer peso, Nodo<T> actual) {
		Integer nuevaDistancia = actual.getDistancia() + peso;
		if (nuevaDistancia < adyacente.getDistancia()) {
			adyacente.setDistancia(nuevaDistancia);
			adyacente.setCaminoMasCorto(
					Stream.concat(actual.getCaminoMasCorto().stream(), Stream.of(actual))
					.toList());
		}
	}

	////////////////////////////////////////////////////////////////////////
	@Override
	public void kruskal() {
		// TODO kruskal
		if (!dirigido) {
			UnionFind unionFind = new UnionFind(nodos.size());
			Set<Arista<T>> arm = new LinkedHashSet<>();
			Queue<Arista<T>> cola = new PriorityQueue<>();
			Arista<T> actual;
			Nodo<T> nodo1;
			Nodo<T> nodo2;
			
			for (Nodo<T> n : this.nodos) {
				cola.addAll(n.getAristas());
			}
			
			while (!cola.isEmpty()) {
				actual = cola.poll();
				nodo1 = actual.getOrigen();
				nodo2 = actual.getDestino();
				//fijarse que no sea la arista inversa
				if(!arm.contains(actual) ||	!arm.contains(actual.aristaInversa())) {
					// revisar que no haga un ciclo
					if(unionFind.connected(nodos.indexOf(nodo1), nodos.indexOf(nodo2))) {
						
						
					}
				}
			}
			arm.forEach(a -> System.out.println(a));
		}
	}

	////////////////////////////////////////////////////////////////////////
	@Override
	public void prim() {
		// TODO prim

	}
	
	////////////////////////////////////////////////////////////////////////

}

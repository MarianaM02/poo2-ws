
import java.util.LinkedHashSet;

import grafos.GrafoLista;
import grafos.Nodo;

public class App {
	public static void main(String[] args) {

		/*
		 * GrafoLista<String> grafo = new GrafoLista<String>(false);
		 * 
		 * Nodo<String> nodoA = new Nodo<String>("A"); Nodo<String> nodoB = new
		 * Nodo<String>("B"); Nodo<String> nodoC = new Nodo<String>("C"); Nodo<String>
		 * nodoD = new Nodo<String>("D"); Nodo<String> nodoE = new Nodo<String>("E");
		 * Nodo<String> nodoF = new Nodo<String>("F");
		 * 
		 * grafo.agregarArista(nodoA, nodoB, 2); grafo.agregarArista(nodoA, nodoC, 4);
		 * 
		 * grafo.agregarArista(nodoB, nodoC, 3); grafo.agregarArista(nodoB, nodoD, 1);
		 * grafo.agregarArista(nodoB, nodoE, 5);
		 * 
		 * grafo.agregarArista(nodoC, nodoD, 2);
		 * 
		 * grafo.agregarArista(nodoD, nodoE, 1); grafo.agregarArista(nodoD, nodoF, 4);
		 * 
		 * grafo.agregarArista(nodoE, nodoF, 2);
		 * 
		 * grafo.dijkstra(nodoA);
		 * 
		 * System.out.println("*Dijkstra:"); grafo.getNodos().forEach((n) ->
		 * System.out.println(n.caminoMasCortoToString()));
		 * 
		 * System.out.println("*BFS:"); System.out.println(grafo.bfs(nodoA));
		 * 
		 * System.out.println("*DFS:"); System.out.println(grafo.dfs(nodoA));
		 * 
		 * System.out.println("*DFS Recursivo:");
		 * System.out.println(grafo.dfsRecursivo(nodoA, new
		 * LinkedHashSet<Nodo<String>>()));
		 * 
		 * System.out.println("*Kruskal:"); grafo.kruskal();
		 */

		GrafoLista<String> grafo = new GrafoLista<String>(false);

		Nodo<String> nodoA = new Nodo<String>("A");
		Nodo<String> nodoB = new Nodo<String>("B");
		Nodo<String> nodoC = new Nodo<String>("C");
		Nodo<String> nodoD = new Nodo<String>("D");
		Nodo<String> nodoE = new Nodo<String>("E");

		grafo.agregarArista(nodoA, nodoB, 1);
		grafo.agregarArista(nodoA, nodoC, 7);
		grafo.agregarArista(nodoA, nodoD, 10);
		grafo.agregarArista(nodoA, nodoE, 5);
		grafo.agregarArista(nodoB, nodoC, 3);
		grafo.agregarArista(nodoC, nodoD, 4);
		grafo.agregarArista(nodoD, nodoE, 2);

		grafo.dijkstra(nodoA);
		System.out.println("*Dijkstra:");
		grafo.getNodos().forEach((n) -> System.out.println(n.caminoMasCortoToString()));
		System.out.println("*BFS:");
		System.out.println(grafo.bfs(nodoA));
		System.out.println("*DFS:");
		System.out.println(grafo.dfsRecursivo(nodoA, new LinkedHashSet<Nodo<String>>()));
		System.out.println("*Kruskal:");
		grafo.kruskal();
		System.out.println("*Prim:");
		grafo.eagerPrim();

	}
}

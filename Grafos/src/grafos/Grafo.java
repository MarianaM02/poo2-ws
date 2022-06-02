package grafos;

public interface Grafo<T> {
	
	boolean dfs(Nodo<T> inicio);
	boolean bfs(Nodo<T> inicio);
	void dijkstra(Nodo<T> inicio);
	void kruskal();
	void eagerPrim();
	
}

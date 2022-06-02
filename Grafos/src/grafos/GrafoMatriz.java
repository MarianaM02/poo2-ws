package grafos;

import java.util.ArrayList;
import java.util.Set;

public class GrafoMatriz<T> implements Grafo<T> {
	private ArrayList<Nodo<T>> nodos;
	private int[][] matriz;
	private boolean esDirigido;

	public GrafoMatriz(ArrayList<Nodo<T>> nodos, boolean esDirigido) {
		this.matriz = new int[nodos.size()][nodos.size()];
		this.esDirigido = esDirigido;
	}

	public void ingresarArista(Nodo<T> origen, Arista<T> arista) {
		int indiceOrigen = nodos.indexOf(origen);
		int indiceDestino = nodos.indexOf(arista.getDestino());
		
		matriz[indiceOrigen][indiceDestino] = arista.getPeso();
		
	}

	public int[][] getMatriz() {
		return matriz;
	}


	@Override
	public boolean dfs(Nodo<T> inicio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean bfs(Nodo<T> inicio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void dijkstra(Nodo<T> inicio) {
		// TODO Auto-generated method stub
	}

	@Override
	public void kruskal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eagerPrim() {
		// TODO Auto-generated method stub
		
	}

}

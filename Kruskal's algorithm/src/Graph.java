import java.util.*;

public class Graph {
	
	private PriorityQueue<Edge> edges;
	private ArrayList<Edge> path;
	
	public PriorityQueue<Edge> getEdges() {
		return edges;
	}
	
	public void setEdges(PriorityQueue<Edge> edges) {
		this.edges = edges;
	}
	
	public ArrayList<Edge> getPath() {
		return path;
	}
	
	public void setPath(ArrayList<Edge> path) {
		this.path = path;
	}
	
	public Graph(PriorityQueue<Edge> edges, ArrayList<Edge> path) {
		this.edges = edges;
		this.path = path;
	}
	
	public ArrayList<Edge> KruskalA(int n) {
		IUnionFind uf = new QuickUnion(n);
		while (!this.getEdges().isEmpty()) {
			Edge e = this.getEdges().poll();
			if (uf.connected(e.getV(), e.getW()));
			else {
				uf.union(e.getV(), e.getW());
				System.out.println("Adding: " + e);
				path.add(e);
			}
		}
		return path;
	}
	
	
	

}

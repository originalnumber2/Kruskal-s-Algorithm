import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String file = "10000EWG.txt";
		Scanner sc = new Scanner(new File(file));
		
		int n = sc.nextInt();
		int edges = sc.nextInt();
		PriorityQueue<Edge> E = new PriorityQueue<Edge>();
		
		
		for (int i = 0; i < edges; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			double w = sc.nextDouble();
			Edge e = new Edge(n1, n2, w);
			E.add(e);
		}
		
		
		Graph forest = new Graph( E, new ArrayList<Edge>());
		
		System.out.println(forest.KruskalA(n));
			
		}
		
	}

	

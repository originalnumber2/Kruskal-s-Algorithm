
public class QuickUnion implements IUnionFind {
   private int[] id;     // id[i] = component identifier of node i
   private int count;    // number of connected components
   
   /**
    * Initializes an empty union-find data structure with N isolated components
    * 0 through N-1
    * @param N the number of nodes
    */
   public QuickUnion(int N) {
      count = N;
      id = new int[N];
      for (int i = 0; i < id.length; i++) {
    	  	id[i] = i;
      }
   }
   
   
   /**
    * Returns the number of connected components.
    * @return the number of connected components (between 1 and N)
    */
   public int count() {
      return count;
   }
   
   /**
    * Returns the component identifier for the component containing node <tt>p</tt>.
    * @param p the integer representing one node
    * @return the component identifier for the component containing node <tt>p</tt>
    */
   public int find(int p) {
      int i = id[p];
      while (i != id[i]) {
    	  	i = id[i];
      }
      id[p] = i;
      return i;
   }
   
   /**
    * Are the two nodes <tt>p</tt> and <tt>q/tt> in the same component?
    * @param p the integer representing one node
    * @param q the integer representing the other node
    * @return <tt>true</tt> if the two nodes <tt>p</tt> and <tt>q</tt> are in
    *    the same component, and <tt>false</tt> otherwise
    * 
    */
   public boolean connected(int p, int q) {
      return find(p) == find(q);
   }
   
   /**
    * Merges the component containing node <tt>p</tt> with the component
    * containing node <tt>q</tt>.
    * @param p the integer representing one node
    * @param q the integer representing the other node
    */
   public void union(int p, int q) {
      int pcomp = find(p);
      int qcomp = find(q);
      if (pcomp != qcomp) {
    	  	id[pcomp] = qcomp;
    	  	count--;
      }
   }
   
   
}
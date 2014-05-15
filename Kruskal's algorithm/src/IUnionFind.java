// based on http://algs4.cs.princeton.edu/15uf/

interface IUnionFind {
   /**
    * Returns the number of connected components.
    * @return the number of connected components (between 1 and N)
    */
   public int count();
   
   /**
    * Returns the component identifier for the component containing node <tt>p</tt>.
    * @param p the integer representing one node
    * @return the component identifier for the component containing node <tt>p</tt>
    */
   public int find(int p);
   
   /**
    * Are the two nodes <tt>p</tt> and <tt>q/tt> in the same component?
    * @param p the integer representing one node
    * @param q the integer representing the other node
    * @return <tt>true</tt> if the two nodes <tt>p</tt> and <tt>q</tt> are in
    *    the same component, and <tt>false</tt> otherwise
    * 
    */
   public boolean connected(int p, int q);
   
   /**
    * Merges the component containing node <tt>p</tt> with the component
    * containing node <tt>q</tt>.
    * @param p the integer representing one node
    * @param q the integer representing the other node
    */
   public void union(int p, int q);

    
}
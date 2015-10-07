public class Edges implements Comparable<Edges>{
	
    private String vertex1;
    private String vertex2;
    private int weight;

    public Edges(String v1, String v2, int w) {
    	
    	vertex1 = v2;
        vertex2 = v1;
        weight = w;
        
    }
    
    public String getVertex1() {
    	
        return vertex1;
        
    }
    
    public String getVertex2() {
    	
        return vertex2;
        
    }
    
    public int getWeight() {
    	
        return weight;
        
    }
    
    public String toString() {
    	
        return vertex1 + " " + vertex2;
        
    }
    
	public int compareTo(Edges e) {

		if (weight < e.weight) {
			
			return -1;
			
		}
		
		return 1;
		  	
	}
    
}
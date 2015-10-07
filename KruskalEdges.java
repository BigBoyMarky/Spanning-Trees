import java.util.*;

public class KruskalEdges {

    Vector<HashSet> vertices = new Vector<HashSet>();
    HashSet<Edges> kEdges = new HashSet<Edges>();

    public HashSet<Edges> getEdges() {
    	
        return kEdges;
        
    }
    
    HashSet<String> getvertices(String v) {
    	
        for (HashSet<String> vertex : vertices) {
        	
            if (vertices.contains(v)) {
            	
                return vertex;
                
            }
            
        }
        
        return null;
        
    }
    
    public void insertEdge(Edges edge) {
    	
        String vertex1 = edge.getVertex1();
        String vertex2 = edge.getVertex2();

        HashSet<String> vertices1 = getvertices(vertex1);
        HashSet<String> vertices2 = getvertices(vertex2);

        if (vertices1 != vertices2) {
        
        	vertices1.addAll(vertices2);
        	vertices.remove(vertices2);
        	kEdges.add(edge);
        	
        }
        
        else {
        
	        if (vertices1 == null) {
	        	
	            kEdges.add(edge);
	            
	            if (vertices2 == null) {
	            	
	                HashSet<String> newvertices = new HashSet<String>();
	                newvertices.add(vertex1);
	                newvertices.add(vertex2);
	                vertices.add(newvertices);
	                
	            }
	            
	            else {
	            	
	            	vertices2.add(vertex1);
	            	
	            }
	            
	        }
	        
	        else {
	        	
	            if (vertices2 == null) {
	            	
	            	vertices1.add(vertex2);
	                kEdges.add(edge);
	                
	            }
	            
	        }
        
        }
        
    }
    
}

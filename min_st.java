import java.util.*;

public class min_st {
	
    public static void main(String[] args) {
    	
        TreeSet<Edges> edges = new TreeSet<Edges>();
        
        Scanner in = new Scanner(System.in);
        int v;
        int weight;
        String input;
        
        v = in.nextInt();
        weight = in.nextInt();
        in.nextLine();
        
        for (int i = 0; i < v; i++) {
        	
        	input = in.nextLine();
        	String v1 = input.substring(0,input.indexOf(" "));
        	input = input.substring(input.indexOf(" ") + 1, input.length());
        	String v2 = input.substring(0,input.indexOf(" "));
        	input = input.substring(input.indexOf(" ") + 1, input.length());
        	int w = Integer.parseInt(input);
        	edges.add(new Edges(v1, v2, w));
        	
        }

        KruskalEdges myKE = new KruskalEdges();

        for (Edges edge : edges) {
        	
            myKE.insertEdge(edge);
            
        }
        
        for (Edges edge : myKE.getEdges()) {
        	
            System.out.println(edge);
            
        }
       
        
    }
    
}
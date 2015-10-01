import java.util.*;

public class Node { 
	
    private String name; 
    private ArrayList<Node> child=new ArrayList<Node> ();
    private int[] cord;
    private double distance;
    private ArrayList<String> path=new ArrayList<String> ();
    
    //constructor
    public Node(String name){ 
        this.name=name;
        cord=new int[2];
        distance=0;
    } 
    //distance
    public void setDist(double x){
    	distance=x;
    }
    public double getDist(){
    	return distance;
    }
    //path
    public void setPath(ArrayList<String> x){
    	path=x;
    }
    public ArrayList<String> getPath(){
    	return path;
    }
    //coordinate
    public void setCord(int x, int y){
    	cord[0]=x;
    	cord[1]=y;
    }
    public int[] getCord(){
    	return cord;
    }
   //name 
   public String getName() { 
        return name; 
    } 
    public void setName(String name) { 
        this.name = name; 
    } 
    //connection
    public ArrayList<Node> getChild() { 
        return child; 
    } 
    public void setChild(ArrayList<Node>child) { 
        this.child = child; 
    } 
    public String toString(){
    	String conn="";
    	for(Node tmp:child)
    		conn+=" "+tmp.getName();
    	return name+" "+cord[0]+","+cord[1]+"conn:"+conn+" distance to target: "+ distance;
    }
}



public class Node {

	int year;
	double water;
	Node n1Yr;
	Node n2Yr;
	Node n1W;
	Node n2W;
	
	public Node(int year, double water, Node n1Yr, Node n2Yr, Node n1W, Node n2W){
		this.year = year;
		this.water = water;
		this.n1Yr = n1Yr;
		this.n2Yr = n2Yr;
		this.n2W = n1W;
		this.n2W = n2W;
	}

	
}

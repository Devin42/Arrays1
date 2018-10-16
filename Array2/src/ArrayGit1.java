
public class ArrayGit1 {

	//comment
	Node root;
	int totalNodes = 1;


	public ArrayGit1(int year, double water) {
		root = new Node(year, water, null, null, null, null);	
	}


	public void addNode(int year, double water) {

		Node newNode = new Node(year, water, null, null, null, null);
		Node currentNodeYr = root;
		Node currentNodeW = root;

		boolean setYr = false;
		boolean setW = false;

		while(setYr == false) {
			if(newNode.year >= currentNodeYr.year && currentNodeYr.n1Yr == null) {
				currentNodeYr.n1Yr = newNode;
				setYr = true;
			}
			else if(newNode.year >= currentNodeYr.year && currentNodeYr.n1Yr != null) {
				currentNodeYr = currentNodeYr.n1Yr;
			}
			if(newNode.year < currentNodeYr.year && currentNodeYr.n2Yr == null) {
				currentNodeYr.n2Yr = newNode;
				setYr = true;
			}
			else if(newNode.year < currentNodeYr.year && currentNodeYr.n2Yr != null) {
				currentNodeYr = currentNodeYr.n2Yr;
			}
		}

		while(setW == false) {
			if(newNode.year >= currentNodeW.year && currentNodeW.n1W == null) {
				currentNodeW.n1W = newNode;
				setW = true;
			}
			else if(newNode.year >= currentNodeW.year && currentNodeW.n1W != null) {
				currentNodeW = currentNodeW.n1W;
			}
			if(newNode.year < currentNodeW.year && currentNodeW.n2W == null) {
				currentNodeW.n2W = newNode;
				setW = true;
			}
			else if(newNode.year < currentNodeW.year && currentNodeW.n2W != null) {
				currentNodeW = currentNodeW.n2W;
			}
		}

		totalNodes++;

	}

	public Node searchYr(int year) {


		Node nodeYr = root;
		Node currentNode = root;
		boolean nodeFound = false;

		while(nodeFound == false) {
			if(currentNode.year == year) {
				nodeYr = currentNode;
				nodeFound = true;
			}
			else if(currentNode.year > year) {
				currentNode = currentNode.n2Yr;
			}
			else if(currentNode.year < year) {
				currentNode = currentNode.n1Yr;
			}
		}

		return nodeYr;

	}

	public Node searchW(int year) {


		Node nodeW = root;
		Node currentNode = root;
		boolean nodeFound = false;

		while(nodeFound == false) {
			if(currentNode.year == year) {
				nodeW = currentNode;
				nodeFound = true;
			}
			else if(currentNode.year > year) {
				currentNode = currentNode.n2W;
			}
			else if(currentNode.year < year) {
				currentNode = currentNode.n1W;
			}
		}

		return nodeW;

	}
	
	public void read() {
		
	}




}

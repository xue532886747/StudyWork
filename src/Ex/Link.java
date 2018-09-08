package Ex;

public class Link {
	private Node root;
	public void add(String data) {
		Node node = new Node(data);
		if(this.root == null) {
			this.root = node;
		}else {
			this.root.addNode(node);
		}
	}
	public void print() {	
		if(this.root != null) {
			this.root.printNode();
		}
	}
}

class test{
	public static void main(String[] args) {
		Link link = new Link();
	
	}
}
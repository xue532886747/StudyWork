package lianbiao;
class Node{
	private String data;
	private Node next;
	public Node(String data) {
		this.data = data;
	}
	public void setNode(Node next) {
		this.next = next;
	}
	public Node getNode() {
		return this.next;
	}
	public void addNode(Node node) {
		if(this.next == null) {
			this.next = node;
		}else {
			this.next.addNode(node);
		}
	}
	public void printNode() {
		System.out.println(this.data);
		if(this.next != null) {
			this.next.printNode();
		}
	}
}
class Link{
	private Node root;
	public void add(String data) {			//增加数据
		Node node = new Node(data);
		if(this.root ==	null) {
			this.root = node;
		}else {
			this.root.addNode(node);
		}
	}
	public void print() {		//取出数据
		 if(this.root != null) {
			 this.root.printNode();
		 }
	}
}
public class LinkTest {
	public static void main(String[] args) {
		Link link  = new Link();
		link.add("Jay");
		link.add("is");
		link.add("good");
		link.add("man");
		link.print();
	}
}

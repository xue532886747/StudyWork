package Ex;

public class Node {
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
	public String getData() {
		return this.data;
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

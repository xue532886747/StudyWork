package study14;

public class Link {
	private class Node{
		private String data;
		private Node next;
		public Node(String data) {
			this.data = data;
		}
	public void addNode(Node node) {
		if(this.next == null) {
			this.next = node;
		}else {
			this.next.addNode(node);
		}
	}
	public String containsNode(String data) {
		if(data.equals(this.data)) {
			return data;
		}else if(this.next != null){
			return this.next.containsNode(data);
		}else {
			return null;
		}
	}
	}
	private Node root;
	private int count = 0;
	public void add(String data) {
		Node node = new Node(data);
		if(this.root == null) {
			this.root = node;
		}else {
			this.root.addNode(node);
		}
		this.count++;
	}
	public int size() {			
		return this.count;
	}
	public String contains(String data) {
		if(data == null||this.root == null) {
			return null;
		}
		return this.root.containsNode(data);
	}
}


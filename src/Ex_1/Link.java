package Ex_1;

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
	public String getNode(int index) {
		if(Link.this.foot++ == index) {
			return this.data;	
		}else {
			return this.next.getNode(index);
		}
	}
	public void setNode(int index,String data) {
		if(Link.this.foot++ == index) {
			this.data =data;
		}else {
			this.next.setNode(index, data);
		}
	}
	}
	private int foot = 0;
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
	public String contains(String data) {			//查询
		if(data == null||this.root == null) {
			return null;
		}
		return this.root.containsNode(data);
	}
	public String get(int index) {
		this.foot = 0;
		if(index > this.count) {
			return null;
		}return this.root.getNode(index);
	}
	public void set(int index,String data) {
		if(index > this.count) {
			return ;
		}this.foot = 0;
		this.root.setNode(index,data);
	}
}


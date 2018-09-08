package Ex_1;

public class Test {
	public static void main(String[] args) {
		Link link = new Link();
		link.add("tony");
		link.add("steven");
		link.add("parker");
		link.add("rode");
		System.out.println(link.contains("tony"));
	}
}


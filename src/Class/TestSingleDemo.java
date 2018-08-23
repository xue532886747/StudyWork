package Class;

public class TestSingleDemo {
	public static void main(String[] args) {
		Newman p;
		p = Newman.getPerson();
		System.out.println("name:"+p.name);
	}
}
class Newman{
	String name;
	private static final Newman PERSON = new Newman();
	private Newman() {
		name = "kehr";
	}
	public static Newman getPerson() {
		return PERSON;
	}
}
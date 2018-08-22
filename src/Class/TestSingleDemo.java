package Class;

public class TestSingleDemo {
	public static void main(String[] args) {
		Person p;
		p = Person.getPerson();
		System.out.println("name:"+p.name);
	}
}
class Person{
	String name;
	private static final Person PERSON = new Person();
	private Person() {
		name = "kehr";
	}
	public static Person getPerson() {
		return PERSON;
	}
}
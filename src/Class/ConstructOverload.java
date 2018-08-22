package Class;
public class ConstructOverload{
	public static void main(String[] args) {
		Person p = new Person(33,"Sherlcok");
		p.talk();
	}
}
class Person{
	private String name;
	private int age;
	
	public Person() {
		name = "rooney";
		age = 22;
	}
	public Person(int age) {
		name = "rooney";
		this.age = age;
	}
	public Person(int age,String name) {
		this.name = name;
		this.age  = age;
	}
	public void talk() {
		System.out.println("Œ“Ω–£∫"+name+",ΩÒƒÍ£∫"+age);
	}
}
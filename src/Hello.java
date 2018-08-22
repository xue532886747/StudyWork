public class Hello {
	private String name;
	private int age;
	public Hello() {
	System.out.println("..........");
}
	public Hello(String name) {
		this();
		this.name = name;
	}
	public Hello(String name,int age) {
		this(name);
		this.name = name;
		this.age  = age;
	}
	public String getInfo() {
		return "Œ“Ω–"+this.name+"ΩÒƒÍ£¨"+this.age;
	}
	public static void main(String[] args) {
		Hello hello = new Hello("rooney",23);
		System.out.println(hello.getInfo());
	}
}
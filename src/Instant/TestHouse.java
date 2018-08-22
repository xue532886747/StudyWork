package Instant;
class Member{
	private int mid;
	private String name;
	private Car car; 		//表示属于人的车
	public Member(int mid,String name) {
		this.mid = mid;
		this.name = name;
	}
	public String getInfo() {
		return  "人员编号："+this.mid+",人员姓名："+this.name;
	}
	public void setCar(Car _car) { //把c传入
		 System.out.println("_car = "+_car);

		this.car = _car;
		 System.out.println("this.car = "+this.car);
	     this.car = new Car("大牛");
		 System.out.println("this.car** = "+this.car);
		 System.out.println("_car** = "+_car);

	}
	public Car getCar() {
		return this.car;
	}
}
class Car{
	private String pname;
	private Member member;	//表示属于车的人
	public Car() {
		System.out.println("calling car constructor1");
	}
	public Car(String pname) {
		this.pname = pname; 
		System.out.println("calling car constructor2");

		
	}
	public String getInfo() {
		return "车的名字："+this.pname;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Member getMember() {
		return this.member;
	}
}
public class TestHouse{
	public static void main(String[] args) {
		Member m = new Member(25,"rooney");//实例化Member的对象 m
		 Car c  = new Car("奥迪A8");//实例化一个Car的对象c
		 System.out.println("c = "+c);
		 m.setCar(c);
		 System.out.println("c** = "+c);
		 c.setMember(m);
		 System.out.println();
		 System.out.println(m.getCar().getInfo());
		 System.out.println(c.getMember().getInfo());
	}

}